package com.math;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;



class NumberShould {

    private static Stream<Arguments> palindromeNumbers() {
        return Stream.of(
                Arguments.of(22, true),
                Arguments.of(11, true),
                Arguments.of(99, true),
                Arguments.of(14, false),
                Arguments.of(27, false),
                Arguments.of(111, true),
                Arguments.of(2002, true)
        );
    }

    @ParameterizedTest
    @MethodSource("palindromeNumbers")
    void reverseOfNumberBeEqualToSelfNumber(int inputNumber, boolean exceptValue) {
        Number number = new Number(inputNumber);
        Assertions.assertThat(number.isPalindromeNumber()).isEqualTo(exceptValue);
    }
}