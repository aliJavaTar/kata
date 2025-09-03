package com.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LCPTest {

    static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new String[]{"alone"}, "alone"),
                Arguments.of(new String[]{}, ""),
                Arguments.of(new String[]{"same", "same", "same"}, "same"),
                Arguments.of(new String[]{"flower", "flow", "flight"}, "fl"),
                Arguments.of(new String[]{"dog", "racecar", "car"}, ""),
                Arguments.of(new String[]{"abab", "aba", ""}, ""),
                Arguments.of(new String[]{"cir", "car"}, "c"),
                Arguments.of(new String[]{"baab", "bacb", "b", "cbc"}, "b"),
                Arguments.of(new String[]{"aba", "ab", "aaca", "aca"}, "a")
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testLongestCommonPrefix(String[] input, String expected) {
        var lcp = new LCP();
        assertEquals(expected, lcp.longestCommonPrefix(input));
    }
}