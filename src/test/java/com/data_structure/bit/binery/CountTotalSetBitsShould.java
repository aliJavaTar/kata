package com.data_structure.bit.binery;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountTotalSetBitsShould {

    //    @Test
    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "3,4", " 4 ,5", "17,35", "867,4100"})
    void calculate_total_count_bits(int input, int expected) {
        var countTotalSetBits = new CountTotalSetBits(input);
        int result = countTotalSetBits.count();
        Assertions.assertThat(result).isEqualTo(expected);
    }
}