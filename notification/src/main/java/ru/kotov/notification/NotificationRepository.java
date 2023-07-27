package ru.kotov.notification;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.kotov.notification.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
