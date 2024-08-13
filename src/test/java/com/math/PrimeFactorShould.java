package com.math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeFactorShould {

    @ParameterizedTest
    @CsvSource({
            "12, 2",
            "15, 2",
            "315, 3",
            "1092, 4"
    })
    void testCalculate(int input, int expectedCount) {
        var primeNumber = new PrimeNumber();
        var primeFactor = new PrimeFactor(primeNumber);

        int actualCount = primeFactor.calculate(input);
        assertEquals(expectedCount, actualCount, "The count of prime factors should match");
    }
}