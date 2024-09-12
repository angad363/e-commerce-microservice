package com.agadgosain.ecommerce.notification;

import com.agadgosain.ecommerce.kafka.order.OrderConfirmation;
import com.agadgosain.ecommerce.kafka.payment.PaymentConfirmation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Service
@Document
public class Notification {

    @Id
    private String id;
    private NotificationType notificationType;
    private LocalDateTime notificationDate;
    private OrderConfirmation orderConfirmation;
    private PaymentConfirmation paymentConfirmation;
}
