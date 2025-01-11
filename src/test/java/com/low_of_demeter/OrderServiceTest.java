package com.low_of_demeter;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class OrderServiceTest {
    @Test
    void testShipOrder() {
        // Arrange
        var mockAddress = mock(Address.class);
        var mockCustomer = mock(Customer.class);

        when(mockAddress.getStreet()).thenReturn("789 Pine St");
        when(mockCustomer.getAddress()).thenReturn(mockAddress);

        var orderService = new OrderService();

        // Act
        orderService.shipOrder(mockCustomer);

        // Assert
        verify(mockCustomer, times(1)).getAddress();
        verify(mockAddress, times(1)).getStreet();
    }
}