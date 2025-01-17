package com.low_of_demeter;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class OrderServiceTest {
    @Test
    void testShipOrder() {
        // Arrange
        var mockCustomer = mock(Customer.class);
        when(mockCustomer.getAddress()).thenReturn("789 Pine St");
        var orderService = new OrderService();

        // Act
        orderService.shipOrder(mockCustomer);

        // Assert
        verify(mockCustomer, times(1)).getAddress();
    }
}