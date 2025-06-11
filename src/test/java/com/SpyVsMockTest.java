package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


public class SpyVsMockTest {

    @Test
    public void testWithMock() {
        Calculator mockCalc = mock(Calculator.class);

        // Stubbing the add method
        when(mockCalc.add(2, 3)).thenReturn(10);

        // Will return 10 as we stubbed it
        assertEquals(10, mockCalc.add(2, 3));

        // multiply is not stubbed, so will return 0 (default for int)
        assertEquals(0, mockCalc.multiply(2, 3)); // Returns default
    }

    @Test
    public void testWithSpy() {
        Calculator realCalc = new Calculator();
        Calculator spyCalc = spy(realCalc);

        // Stubbing add method only
        when(spyCalc.add(2, 3)).thenReturn(10);

        // Will return 10 as stubbed
        assertEquals(10, spyCalc.add(2, 3));

        // multiply not stubbed, so real method will be called
        assertEquals(6, spyCalc.multiply(2, 3));
    }
}
