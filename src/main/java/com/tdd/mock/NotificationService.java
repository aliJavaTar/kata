package com.tdd.mock;

public class NotificationService {
    private final EmailService emailService;

    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void notifyUser(String email,String subject, String body) {
        emailService.sendEmail(email, subject, body);
    }
}