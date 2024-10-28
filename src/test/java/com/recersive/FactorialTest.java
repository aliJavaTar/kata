package com.recersive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void calculate() {
        int result = new Factorial(5).calculate_tail_recursive(5,1);
        Assertions.assertThat(result).isEqualTo(120);
    }
}