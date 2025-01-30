package com.tdd.spi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CalculatorTest {

    @Test
    void testPartialMockingWithSpy() {
        var calculator = spy(new Calculator());
        when(calculator.add(5, 3)).thenReturn(100);
        assertEquals(100, calculator.add(5, 3));

        assertEquals(2, calculator.subtract(5, 3));

        verify(calculator).add(5, 3);
        verify(calculator).subtract(5, 3);
    }

}