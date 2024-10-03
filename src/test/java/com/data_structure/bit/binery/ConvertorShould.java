package com.data_structure.bit.binery;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertorShould {
    @ParameterizedTest
    @CsvSource({
            "2, 10",
            "3, 11",
            "5, 101",
            "7, 111",
            "9, 1001",
            "10, 1010"
    })
    void convertNumberToBinary(int input, String expected) {
        String result = new Convertor(input).convertNumberToBinary_();
        assertEquals(expected, result);
    }
}