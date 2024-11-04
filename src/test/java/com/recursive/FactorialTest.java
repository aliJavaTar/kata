package com.recursive;

import com.recursive.extra.Fact;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTest {

    @Test
    void calculate() {
        int result = new Fact(5).calculate(5);
        Assertions.assertThat(result).isEqualTo(120);
    }
}