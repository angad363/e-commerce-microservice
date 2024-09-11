package com.angadgosain.ecommerce.kafka;

import com.angadgosain.ecommerce.customer.CustomerResponse;
import com.angadgosain.ecommerce.order.PaymentMethod;
import com.angadgosain.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
