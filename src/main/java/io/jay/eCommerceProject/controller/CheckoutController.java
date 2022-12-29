package io.jay.eCommerceProject.controller;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import io.jay.eCommerceProject.dto.PaymentInfo;
import io.jay.eCommerceProject.dto.Purchase;
import io.jay.eCommerceProject.dto.PurchaseResponse;
import io.jay.eCommerceProject.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    @Autowired
    CheckoutService checkoutService;

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {
        return checkoutService.placeOrder(purchase);
    }

    @PostMapping("/payment-intent")
    public ResponseEntity<String> createPaymentIntent(@RequestBody PaymentInfo paymentInfo) throws StripeException {

        PaymentIntent paymentIntent = checkoutService.createPaymentIntent(paymentInfo);

        return new ResponseEntity<>(paymentIntent.toJson(), HttpStatus.OK);
    }
}
