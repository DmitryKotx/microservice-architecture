package ru.kotov.notification.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kotov.clients.notification.NotificationRequest;
import ru.kotov.notification.model.Notification;
import ru.kotov.notification.repository.NotificationRepository;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;
    public void send(NotificationRequest notificationRequest) {
        notificationRepository.save(
                Notification.builder()
                        .toCustomerId(notificationRequest.toCustomerId())
                        .toCustomerEmail(notificationRequest.toCustomerName())
                        .sender("Dima")
                        .message(notificationRequest.message())
                        .sentAt(LocalDateTime.now())
                        .build()
        );
    }
}
