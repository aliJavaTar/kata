package com.math;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class TrailingZerosShould {

    private static Stream<Arguments> factorialNumber() {
        return Stream.of(
                Arguments.of(5, 1),
                Arguments.of(20, 4),
                Arguments.of(100, 24)
        );
    }

    @ParameterizedTest
    @MethodSource("factorialNumber")
    void countOfTrailingZerosInFactorial(int number, int result) {
        TrailingZeros trailingZeros = new TrailingZeros(number);
        int count = trailingZeros.count();
        Assertions.assertThat(count).isEqualTo(result);
    }
}