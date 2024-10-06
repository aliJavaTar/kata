package com.data_structure.bit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PowTest {

    @ValueSource(ints = {2, 4, 32, 16})
    @ParameterizedTest
    void isPowOfTwo(int input) {
        var pow = new Pow(input);
        boolean result = pow.isPowOfTwo();
        Assertions.assertThat(result).isTrue();
    }

    @ValueSource(ints = {3, 5, 6, 1423})
    @ParameterizedTest
    void is_not_PowOfTwo(int input) {
        var pow = new Pow(input);
        boolean result = pow.isPowOfTwo();
        Assertions.assertThat(result).isFalse();
    }
}