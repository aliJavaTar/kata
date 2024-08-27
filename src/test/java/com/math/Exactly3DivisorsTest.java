package com.math;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Exactly3DivisorsTest {
    @Test
    void test() {
        Exactly3Divisors e = new Exactly3Divisors();
        int result = e.exactly3Divisors(10);
        Assertions.assertThat(result).isEqualTo(2);
    }
}