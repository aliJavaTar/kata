package com.old.quera;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticSequenceShould {
    @Test
    void give() {
        ArithmeticSequence arithmeticSequence = new ArithmeticSequence();
        int result = arithmeticSequence.calculate(List.of(1, 2, 4), 1);
        assertEquals(1, result);

        ArithmeticSequence arithmetic = new ArithmeticSequence();
        result = arithmetic.calculate(List.of(1, 3, 5), 1);
        assertEquals(2, result);

         arithmetic = new ArithmeticSequence();
        result = arithmetic.calculate(List.of(2, 4, 5), 1);
        assertEquals(2, result);
    }
}