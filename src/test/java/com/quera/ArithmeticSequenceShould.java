package com.quera;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ArithmeticSequenceShould {

    @Test
    public void calculate_minimum_of_amount_changes_from_sequence() {
        int n = 3;
        int k = 1;
        int[] sequence = {1, 3, 5};

        int result = ArithmeticSequence.calculateMinimumChanges(n, k, sequence);

        assertEquals(2, result);

        n = 4;
        k = 3;
        sequence = new int[]{1, 2, 3, 4};

         result = ArithmeticSequence.calculateMinimumChanges(n, k, sequence);

        assertEquals(8, result);
    }
}