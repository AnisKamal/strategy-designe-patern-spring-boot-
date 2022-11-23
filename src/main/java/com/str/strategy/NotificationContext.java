package com.str.strategy;


import com.str.strategy.enums.NotificationType;
import com.str.strategy.exception.NotFoundNotifictionStrtegy;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

@AllArgsConstructor
@Component
@Slf4j
public class NotificationContext {
    private final Map<NotificationType, NotificationStrategy> sendNotificationByType;

    public void sendMessge(String message, NotificationType notificationType)
            throws NotFoundNotifictionStrtegy {
        NotificationStrategy notificationStrategy = sendNotificationByType.getOrDefault(notificationType, null);

        if(Objects.isNull(notificationStrategy)){
            throw new NotFoundNotifictionStrtegy("Notification type not found. type" + notificationType);
        }
        notificationStrategy.sendMessage(message);

    }
}
