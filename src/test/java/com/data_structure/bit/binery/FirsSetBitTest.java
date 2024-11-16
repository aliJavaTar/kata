package com.data_structure.bit.binery;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FirsSetBitTest {

    @ParameterizedTest
    @CsvSource({" 18,2 ", " 12 ,3 "})
    void test(int input, int excepted) {
        var firsSetBit = new FirsSetBit(input);
        Assertions.assertThat(firsSetBit.find()).isEqualTo(excepted);
    }
}