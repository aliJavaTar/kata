package com.codeWars.square;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
        int sum = squareSum.sum(array);
        assertThat(sum).isEqualTo(1);

        array[0] = 2;
        int sum1 = squareSum.sum(array);
        assertThat(sum1).isEqualTo(4);

        array[0] = 5;
        int sum2 = squareSum.sum(array);
        assertThat(sum2).isEqualTo(25);

    }

    @Test
    void should_give_number_of_array_and_pow_and_sum_numbers() {
        int[] array = new int[2];
        array[0] = 1;
        array[1] = 2;
        int sum = squareSum.sum(array);
        assertThat(sum).isEqualTo(5);
    }

}