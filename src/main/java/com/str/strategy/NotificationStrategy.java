package com.str.strategy;

import com.str.strategy.enums.NotificationType;

public interface NotificationStrategy {

    void sendMessage(String  message);

    NotificationType notificationType();
}


