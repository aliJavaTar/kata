package com.data_structure.bit.binery;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class SeparateShould {


    @ParameterizedTest
    @ValueSource(ints = {2})
    void takes_number_and_Give_one_when_binary_number_has_zero_and_one(int number) {
        var separate = new Separate(number);
        boolean result = separate.isSeparate();
        assertThat(result).isTrue();

    }
}