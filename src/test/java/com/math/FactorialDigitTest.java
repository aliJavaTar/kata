package com.math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FactorialDigitTest {
    @ParameterizedTest
    @CsvSource({
            "5, 3",
//            "1, 1",
//            "2, 2",
//            "3, 6",
//            "4, 24",
//            "5, 120"
    })
    void calculateFactorialOfNumbers(int number, int expectedResult) {

//        var factorialDigit = new FactorialDigit();
////        int result = factorialDigit.calculate(number);
//
//        assertEquals(expectedResult, result, "Calculated factorial does not match expected result");
    }
}