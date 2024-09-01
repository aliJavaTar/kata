package com.codeforces;



import com.old.leetcode.easy.AddStrings;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AddStringTest {


    @ParameterizedTest
    @CsvSource({
            "0,0,0",
            "12, 12, 24",
            "0, 0, 0",
            "0, 123, 123",
            "123, 0, 123",
    })
    void testAddition(String firstNumber, String secondNumber, String expected) {
        var addStrings = new AddStrings(firstNumber, secondNumber);

        String result = addStrings.add();
        Assertions.assertThat(result).isEqualTo(expected);
    }
}