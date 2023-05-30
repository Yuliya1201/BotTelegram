package com.example.bottelegram.service;

import com.example.bottelegram.entity.NotificationTask;
import com.example.bottelegram.repository.NotificationTaskRepository;
import org.springframework.stereotype.Service;

@Service

public class NotificationTaskService {
    private final NotificationTaskRepository notificationTaskRepository;
    public NotificationTaskService(NotificationTaskRepository notificationTaskRepository) {
        this.notificationTaskRepository = notificationTaskRepository;
    }
    public void save(NotificationTask notificationTask) {
        notificationTaskRepository.save(notificationTask);
    }
}
