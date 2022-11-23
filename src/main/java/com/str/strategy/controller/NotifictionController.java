package com.str.strategy.controller;

import com.str.strategy.NotificationContext;
import com.str.strategy.enums.NotificationType;
import com.str.strategy.exception.NotFoundNotifictionStrtegy;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class NotifictionController {

    private final NotificationContext notifictionContext;

    @GetMapping
    public String sendNotification(@RequestParam String message, @RequestParam NotificationType notificationType)
    throws NotFoundNotifictionStrtegy {
        notifictionContext.sendMessge(message, notificationType);
        return message;
    }
}
