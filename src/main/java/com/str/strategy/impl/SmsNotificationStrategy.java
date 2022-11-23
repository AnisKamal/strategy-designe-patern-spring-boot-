package com.str.strategy.impl;

import com.str.strategy.NotificationStrategy;
import com.str.strategy.enums.NotificationType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SmsNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendMessage(String message) {
        log.info("message send to phone " + message);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }
}
