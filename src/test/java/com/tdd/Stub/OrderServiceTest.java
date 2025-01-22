package com.tdd.Stub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.*;

class OrderServiceTest {

    @Test
    void testOrderProcessingWithStub() {

        PaymentService paymentService = mock(PaymentService.class);
        when(paymentService.processPayment(anyDouble())).thenReturn(true);

        OrderService orderService = new OrderService(paymentService);
        boolean result = orderService.processOrder(100.0);

        assertTrue(result);
    }


    @Test
    void testOrderProcessingWithMock() {
        PaymentService paymentService = mock(PaymentService.class);

        OrderService orderService = new OrderService(paymentService);

        orderService.processOrder(200.0);


        verify(paymentService).processPayment(200.0);

        verify(paymentService, times(1)).processPayment(200.0);
    }
}


