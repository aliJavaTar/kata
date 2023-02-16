package com.codeWars.square;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareSumTest {
    private SquareSum squareSum;

    @BeforeEach
    void setUp() {
        squareSum = new SquareSum();
    }

    @Test
    void should_give_one_when_pass_a_one() {
        int[] array = new int[1];
        array[0] = 1;

        squareSum.sum(array);
    }

}