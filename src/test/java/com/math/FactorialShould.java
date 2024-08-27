package com.math;



import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class FactorialShould {

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 120"
    })
    void calculateFactorialOfNumbers(int number, int expectedResult) {
        var factorial = new Factorial(number);
//        int result = factorial.calculateFactorialOfNumber();
//        assertEquals(expectedResult, result, "Calculated factorial does not match expected result");
    }
}