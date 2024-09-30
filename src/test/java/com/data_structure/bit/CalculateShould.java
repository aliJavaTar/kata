package com.data_structure.bit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateShould {

    @Test
    void calculateBinary() {
        Calculate calculate = new Calculate();
        int result = calculate.calculateBinary(3, 5);
        assertEquals(7, result);
    }
}