package com.data_structure.bit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FirstSetBitsShould {


    @ParameterizedTest
    @MethodSource("testCases")
    void findPossibleFirstSetBit(int input, int expectedPosition) {
        var firstSetBit = new FirstSetBit(input);
        int actualPosition = firstSetBit.findPossibleFirstSetBit();
        assertEquals(expectedPosition, actualPosition, "Position of first set bit should match expected value.");
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(4, 2),
                Arguments.of(8, 3),
                Arguments.of(18, 1),
                Arguments.of(12, 2),
                Arguments.of(500, 2),
                Arguments.of(64, 6),
                Arguments.of(15, 1)
        );
    }
}