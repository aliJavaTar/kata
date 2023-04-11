package com.codeWars.six.prime;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 7, 11, 23, 5, 17, 113, 359, 2707, 3491})
    void should_give_ture_if_number_is_prime(int number) {
        Prime prime = new Prime();
        assertTrue(prime.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 9, 10, 222, 85, 78, 96, 33, 105, 3493})
    void should_give_false_when_number_is_not_prime(int number) {
        Prime prime = new Prime();
        assertFalse(prime.isPrime(number));
    }
}