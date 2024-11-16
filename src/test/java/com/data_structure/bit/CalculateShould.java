package com.data_structure.bit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateShould {

    @Test
    void calculateBinary() {
        Calculate calculate = new Calculate();
        int result = calculate.calculateBinaryOrOperate(3, 5);
        assertEquals(7, result);

        result = calculate.calculateBinaryAndOperate(3, 5);
        assertEquals(1, result);

        result = calculate.calculateBinaryAndOperate(1, 7);
        assertEquals(1, result);

        result = calculate.calculateBinaryShiftLeftOperate(1, 1);
        assertEquals(2, result);

        result = calculate.calculateBinaryShiftLeftOperate(3, 2);
        assertEquals(12, result);

        result = calculate.calculateBinaryShiftRightOperate(3, 2);
        assertEquals(0, result);

        result = calculate.calculateBinaryShiftRightOperate(3, 1);
        assertEquals(1, result);

    }
}