package com.data_structure.bit.binery;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class CountShould {
    @ParameterizedTest
    @CsvSource({
            "2, 1",
            "4, 1",
            "5, 2",
            "6, 2",
            "7, 3",
            "8, 1",
            "9, 2",
            "10, 2",
            "11, 3",
            "12, 2",
    })
    void calculateCountOfSubtractionsOfPowersOfTwoUntilNegative(int input, int expected) {
        int calculate = new Count(input).calculate_performance();
        System.out.println(calculate);
        Assertions.assertThat(calculate).isEqualTo(expected);
    }
}