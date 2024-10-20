package com.data_structure.bit.binery;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FindKthBitInNthBinaryStringTest {

    @ParameterizedTest
    @CsvSource({
            //n = 3, k = 1
            "3, 1 ",
            "4, 2",
    })
    public void should_find_kth(int n, int k) {
        var findKthBitInNthBinaryString = new FindKthBitInNthBinaryString(n, k);
        var kthBit = findKthBitInNthBinaryString.findKthBit();
        Assertions.assertThat(kthBit).isTrue();
    }
}