package com.codeWars;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {
    private EvenOrOdd evenOrOdd;

    @BeforeEach
    void setUp() {
        evenOrOdd = new EvenOrOdd();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 35, 77})
    void should_give_me_even_when_give_even_number(int number) {
//        String odd1 = evenOrOdd.even_or_odd(number);
//        String odd35 = evenOrOdd.even_or_odd(number);
//        String odd777 = evenOrOdd.even_or_odd(number);


        assertThat(evenOrOdd.even_or_odd(number)).isEqualTo("Odd");
//        assertThat(odd35).isEqualTo("Odd");
//        assertThat(odd777).isEqualTo("Odd");
    }

    @Test
    void should_give_me_odd_when_give_odd_number() {
        String even2 = evenOrOdd.even_or_odd(2);
        String even78 = evenOrOdd.even_or_odd(78);
        String even24 = evenOrOdd.even_or_odd(24);


        assertThat(even2).isEqualTo("Even");
        assertThat(even78).isEqualTo("Even");
        assertThat(even24).isEqualTo("Even");
    }
}