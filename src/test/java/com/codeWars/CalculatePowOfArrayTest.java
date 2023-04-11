package com.codeWars;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatePowOfArrayTest {

    @Test
    void should_give_number_of_index_array_and_calculate_pow_of_this_number() {
        CalculatePowOfArray calculate = new CalculatePowOfArray();
        int[] array = {1, 2, 3, 4};
        int actual = calculate.calculate(array, 2);
        Assertions.assertThat(actual).isEqualTo(9);
    }
}