package com.math.dsa;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialShould {

    @Test
    void out_put_zero_when_input_is_null() {
        var factorial = new Factorial(0);
        int result = factorial.calculate();
        assertThat(result).isEqualTo(1);
    }

    @ParameterizedTest
    @CsvSource({"2,2", "5,120"})
    void calculate_factorial_of_number(int input, int expected) {
        var factorial = new Factorial(input);
        int result = factorial.calculate();
        assertThat(result).isEqualTo(expected);
    }
}