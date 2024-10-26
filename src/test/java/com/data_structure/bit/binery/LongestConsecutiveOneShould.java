package com.data_structure.bit.binery;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LongestConsecutiveOneShould {
    @ParameterizedTest
    @CsvSource({"3 ,2 ", "7, 3", "15 , 4", "29,3", "5,1" ,"222,4"})
    void find_must_count_sequence_of_one(int input, int expected) {
        var longestConsecutive = new LongestConsecutiveOne(input);
        int result = longestConsecutive.calculateMustSequenceOne_();
        Assertions.assertThat(result).isEqualTo(expected);
    }
}
