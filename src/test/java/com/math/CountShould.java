package com.math;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountShould {

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "11, 2",
            "1234, 4",
            "25422, 5",
            "120, 3",
            "9876565, 7"
    })
    void countOfDigit(int number, int digits) {
        Count count = new Count(number);
        int result = count.calculateCountOfDigit();
        Assertions.assertThat(result).isEqualTo(digits);
    }

}