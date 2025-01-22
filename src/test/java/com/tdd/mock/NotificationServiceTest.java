package com.tdd.mock;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class NotificationServiceTest {
    @Test
    public void testNotifyUserWithMock() {
        EmailService emailService = mock(EmailService.class);
        NotificationService notificationService = new NotificationService(emailService);

        // Call the method under test
        notificationService.notifyUser("test@example.com");

        // Verify that the emailService.sendEmail method was called with correct arguments
        verify(emailService).sendEmail("test@example.com", "Subject", "Body");
    }
}