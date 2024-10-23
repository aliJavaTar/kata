package com.data_structure.bit.binery;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class RightmostDifferentBitShould {

    static Stream<Object[]> rightmostDifferentBitCases() {
        return Stream.of(new Object[]{2, 2, -1}, new Object[]{4, 5, 1}, new Object[]{11, 9, 2}, new Object[]{52, 4, 5});
    }

    @ParameterizedTest
    @MethodSource("rightmostDifferentBitCases")
    void find_the_position_of_the_rightmost_different_bit_in_the_binary_representation(int m, int n, int expected) {
        var rightmostDifferentBit = new RightmostDifferentBit(m, n);
        int result = rightmostDifferentBit.find();
        Assertions.assertThat(result).isEqualTo(expected);
    }
}