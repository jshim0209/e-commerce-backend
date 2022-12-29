package io.jay.eCommerceProject.service;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import io.jay.eCommerceProject.dto.PaymentInfo;
import io.jay.eCommerceProject.dto.Purchase;
import io.jay.eCommerceProject.dto.PurchaseResponse;
import io.jay.eCommerceProject.model.Customer;
import io.jay.eCommerceProject.model.Order;
import io.jay.eCommerceProject.model.OrderItem;
import io.jay.eCommerceProject.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class CheckoutService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    public CheckoutService(CustomerRepository customerRepository,
                           @Value("${stripe.key.secret}") String secretKey) {
        this.customerRepository = customerRepository;

        // initialize Stripe API with secret key
        Stripe.apiKey = secretKey;
    }

    private String generateOrderTrackingNumber() {
        return UUID.randomUUID().toString();
    }

    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        // retrieve the order info from purhcase dto
        Order order = purchase.getOrder();

        // generate tracking number
        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);

        // populate order with orderItems
        Set<OrderItem> orderItems = purchase.getOrderItems();
        orderItems.forEach(order::add);

        // populate order with billingAddress and shippingAddress
        order.setBillingAddress(purchase.getBillingAddress());
        order.setShippingAddress(purchase.getShippingAddress());

        // populate user with order
        Customer customer = purchase.getCustomer();

        // check if this is an existing user
        String email = customer.getEmail();

        Optional<Customer> customerFromDB = customerRepository.findByEmail(email);

        if (customerFromDB.isPresent()) {
            customer = customerFromDB.get();
        }

        customer.add(order);

        // save to the database
        customerRepository.save(customer);

        // return a response
        return new PurchaseResponse(orderTrackingNumber);
    }

    public PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException {
        List<String> paymentMethodTypes = new ArrayList<>();
        paymentMethodTypes.add("card");

        Map<String, Object> params = new HashMap<>();
        params.put("amount", paymentInfo.getAmount());
        params.put("currency", paymentInfo.getCurrency());
        params.put("payment_method_types", paymentMethodTypes);
        params.put("description", "Purchase from Mushidda");
        params.put("receipt_email", paymentInfo.getReceiptEmail());

        return PaymentIntent.create(params);
    }

}
