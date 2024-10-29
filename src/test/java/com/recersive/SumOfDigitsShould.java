package com.recersive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SumOfDigitsShould {

    @ParameterizedTest
    @CsvSource({"12345 ,15", "45632 ,20"})
    void calculateSum(int input, int excepted) {
        var sumOfDigits = new SumOfDigits();
        int result = sumOfDigits.calculateSumOfDigits(input);
        Assertions.assertThat(result).isEqualTo(excepted);
    }

}