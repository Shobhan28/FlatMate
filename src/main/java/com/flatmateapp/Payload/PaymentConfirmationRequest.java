package com.flatmateapp.Payload;

import lombok.Data;

@Data
public class PaymentConfirmationRequest {
    private String paymentIntentId;
    private double amount;
    private String currency;
}
