package com.math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 7, 29, 67, 89})
    void isPrime_ShouldReturnTrueForPrimeNumbers(int number) {
        PrimeNumber primeNumber = new PrimeNumber();
        assertTrue(primeNumber.isPrime(number), () -> String.format("%d is not a prime firstNumber", number));
    }
}