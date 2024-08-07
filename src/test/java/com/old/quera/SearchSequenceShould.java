package com.old.quera;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchSequenceShould {

    static Stream<Arguments> calculateTestCases() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2), Arrays.asList(1, 2, 3), Arrays.asList(0, 1, 2)),
                Arguments.of(Arrays.asList(10, 20), Arrays.asList(5, 15, 25), Arrays.asList(0, 1, 2)),
                Arguments.of(Arrays.asList(30, 40), Arrays.asList(35, 45, 55), Arrays.asList(1, 2, 2))
        );
    }

    @ParameterizedTest
    @MethodSource("calculateTestCases")
    void calculateTest(List<Integer> list, List<Integer> numbers, List<Integer> expectedResult) {
        SearchSequence searchSequence = new SearchSequence();
        List<Integer> result = searchSequence.calculateFunctional(list, numbers);
        assertEquals(expectedResult, result);
    }

}