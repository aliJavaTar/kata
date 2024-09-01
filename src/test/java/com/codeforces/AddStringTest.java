package com.codeforces;

import static org.junit.jupiter.api.Assertions.*;

import com.old.leetcode.easy.AddStrings;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AddStringTest {

    public static final String FORMAT = "Addition of %s and %s should be %s";

    @ParameterizedTest
    @CsvSource({
            "0,0,0",
            "12, 12, 24",
//            "-123, 456, 333",
//            "123, -456, -333",
//            "-123, -456, -579",
            "0, 0, 0",
            "0, 123, 123",
            "123, 0, 123",
//            "-123, 0, -123"
    })
    void testAddition(String firstNumber, String secondNumber, String expected) {
        var addStrings = new AddStrings(firstNumber, secondNumber);

        String result = addStrings.add();
        Assertions.assertThat(result).isEqualTo(expected);
    }
}