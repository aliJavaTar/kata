package com.math.dsa;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialShould {

    @Test
    void out_put_zero_when_input_is_null() {
        var factorial = new Factorial(0);
        int result = factorial.calculate();
        assertThat(result).isEqualTo(1);
    }

    @Test
    void calculate_factorial_of_number() {
        var factorial = new Factorial(1);
        int result = factorial.calculate();
        assertThat(result).isEqualTo(1);

        var factorial1 = new Factorial(2);
        int result1 = factorial1.calculate();
        assertThat(result1).isEqualTo(2);
    }
}