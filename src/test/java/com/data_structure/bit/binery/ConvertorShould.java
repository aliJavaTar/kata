package com.data_structure.bit.binery;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

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
        Count count = new Count(input);
        String result = count.countOfNumber();
        assertEquals(expected, result);
    }
}