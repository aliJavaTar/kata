package com.tdd.mock;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class NotificationServiceTest {
    @Test
    public void testNotifyUserWithMock() {
        EmailService emailService = mock(EmailService.class);
        NotificationService notificationService = new NotificationService(emailService);

        notificationService.notifyUser("test@example.com","Subject","Body");

        verify(emailService).sendEmail("test@example.com", "Subject", "Body");

        // Verify interaction (mocking)
//        verify(paymentService).processPayment(200.0);
//
//        // Verify the method was called exactly once
//        verify(paymentService, times(1)).processPayment(200.0);
    }
}