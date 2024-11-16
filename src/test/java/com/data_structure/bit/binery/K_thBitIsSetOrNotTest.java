package com.data_structure.bit.binery;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class K_thBitIsSetOrNotTest {
    @ParameterizedTest
    @CsvSource({"4 , 0 , false , 4 , 1 , true , 500 , 3 ,false "})
    void give_true_when_is_set(int number, int key, boolean expected) {

        var kThBitIsSetOrNot = new K_thBitIsSetOrNot(number, key);
        boolean result = kThBitIsSetOrNot.isSet();
        Assertions.assertThat(result).isEqualTo(expected);
    }
}