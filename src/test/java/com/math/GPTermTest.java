package com.math;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GPTermTest {
    @Test
    void test() {
        GPTerm gpTerm = new GPTerm();
        int result = gpTerm.GpTerm(1, 2, 5);
        Assertions.assertThat(result).isEqualTo(16);

         result = gpTerm.GpTerm(84, 87, 3);
        Assertions.assertThat(result).isEqualTo(90);
    }
}