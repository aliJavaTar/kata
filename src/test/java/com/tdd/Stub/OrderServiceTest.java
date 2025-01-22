package com.tdd.Stub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OrderServiceTest {

    @Test
    void testOrderProcessingWithStub() {
        // Create a mock of PaymentService
        PaymentService paymentService = mock(PaymentService.class);
        when(paymentService.processPayment(anyDouble())).thenReturn(true);

        OrderService orderService = new OrderService(paymentService);
        boolean result = orderService.processOrder(100.0);

        assertTrue(result);
    }
}


