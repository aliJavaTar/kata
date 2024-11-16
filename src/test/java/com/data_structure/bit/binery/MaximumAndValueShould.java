package com.data_structure.bit.binery;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumAndValueShould {
    @ParameterizedTest
    @MethodSource("palindromeCombos")
    void testMaximumAndValue(int[] input, int expectedOutput) {
        MaximumAndValue maximumAndValue = new MaximumAndValue(input);
        assertEquals(expectedOutput, maximumAndValue.find());
    }

    private static Stream<Arguments> palindromeCombos() {
        return Stream.of(
                Arguments.of(new int[]{4, 8, 12, 16}, 8),
                Arguments.of(new int[]{4, 8, 16, 2}, 0),
                Arguments.of(new int[]{4, 8, 12, 16, 12, 56565}, 16)
        );
    }

    @Test
    void testEmptyArray() {
        int[] emptyArr = {};
        MaximumAndValue maximumAndValue = new MaximumAndValue(emptyArr);
        assertEquals(0, maximumAndValue.find());
    }

    @Test
    void testSingleElementArray() {
        int[] singleArr = {5};
        MaximumAndValue maximumAndValue = new MaximumAndValue(singleArr);
        assertEquals(0, maximumAndValue.find());
    }
}