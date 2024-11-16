package com.recursive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SumShould {

    @Test
    void calculate() {
        int number = 6;
        var sum = new Sum();
        int result = sum.calculate(number);
        Assertions.assertThat(result).isEqualTo(21);
    }
}