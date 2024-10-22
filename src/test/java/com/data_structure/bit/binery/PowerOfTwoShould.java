package com.data_structure.bit.binery;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class PowerOfTwoShould {

    @ParameterizedTest
    @ValueSource(longs = {1, 2, 4, 8, 16, 32, 1024, 1073741824,1099511627776L})
    void check_number_is_power_of_two(long number) {
        var powerOfTwo = new PowerOfTwo(number);
        boolean result = powerOfTwo.isPowerOfTwo_bit();
        assertThat(result).isTrue();
    }
}