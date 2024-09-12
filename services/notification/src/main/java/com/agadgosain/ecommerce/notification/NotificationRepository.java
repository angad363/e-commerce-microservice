package com.agadgosain.ecommerce.notification;

import com.agadgosain.ecommerce.notification.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, String> {
}
