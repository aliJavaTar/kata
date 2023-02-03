package com.codeWars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class EvenOrOddTest {
    private EvenOrOdd evenOrOdd;

    @BeforeEach
    void setUp() {
        evenOrOdd = new EvenOrOdd();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 35, 77})
    void should_give_me_even_when_give_even_number(int number) {
        assertThat(evenOrOdd.even_or_odd(number)).isEqualTo("Odd");
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 44, 88})
    void should_give_me_odd_when_give_odd_number(int number) {
        assertThat(evenOrOdd.even_or_odd(number)).isEqualTo("Even");
    }
}