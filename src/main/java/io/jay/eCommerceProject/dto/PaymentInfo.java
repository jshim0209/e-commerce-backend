package io.jay.eCommerceProject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentInfo {

    private int amount;
    private String currency;
    private String receiptEmail;
}
