package com.data_structure.bit.binery;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class PowerOfTwoShould {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 8, 16, 32, 1024})
    void check_number_is_power_of_two(int number) {
        var powerOfTwo = new PowerOfTwo(number);
        boolean result = powerOfTwo.isPowerOfTwo();
        assertThat(result).isTrue();
    }
}