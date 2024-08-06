package com.math;

import org.assertj.core.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LcmShould {

    @ParameterizedTest
    @CsvSource({
            "3, 6, 6",
            "4, 6, 12",
            "8, 12, 24",
            "15, 25, 75"
    })
    void calculate_returns_least_common_multiple_of_two_numbers(int firstNumber, int secondNumber, int expectedLcm) {
        Lcm lcm = new Lcm(firstNumber, secondNumber);
        int result = lcm.calculate();

        Assertions.assertThat(result).isEqualTo(expectedLcm);
    }
}