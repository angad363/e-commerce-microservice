package com.angadgosain.ecommerce.payment;

import com.angadgosain.ecommerce.customer.CustomerResponse;
import com.angadgosain.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}

