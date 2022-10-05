package com.tworuszka.clients.notification;

import com.tworuszka.clients.fraud.FraudCheckResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "notification",
        url = "${clients.notification.url}",
        path = "api/v1/notification")
public interface NotificationClient {

    @PostMapping
    void sendNotification(@RequestBody NotificationRequest notificationRequest);
}
