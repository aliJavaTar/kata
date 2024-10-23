package com.data_structure.bit.binery;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class LongestConsecutiveOneShould {
    @ParameterizedTest
    @ValueSource(ints = {3, 7, 15, 29})
    void find_must_count_sequence_of_one(int input) {
        var longestConsecutive = new LongestConsecutiveOne(input);
        int result = longestConsecutive.calculateMustSequenceOne();
//        int expected = expectedLongestConsecutiveOnes(input);
//        assertThat(result).isEqualTo(expected);
    }
}
