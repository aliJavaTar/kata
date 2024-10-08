package com.data_structure.bit;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigInteger;


class CountSetBitsShould {
    @ParameterizedTest
    @CsvSource({
            "6, 2",      // Binary: 110
            "13, 3",     // Binary: 1101
            "9, 2",      // Binary: 1001
            "9999999999999999999999999999999999999999999999999999" +
                    "9999999999999999999999999999999999999999999999999999" +
                    "99999999999999999999999999999999999999999999999999999" +
                    "9999999999999999999999999999999999999999999999999999" +
                    "9999999999999999999999999999999999999999999999999999" +
                    "99999999999999999999999999999999999999999999999999999" +
                    "999999999999999999999999999999999999999999999999999999, 793", // Larger number
            "1, 1",      // Binary: 1
            "0, 0"       // Binary: 0
    })
    void calculate_set_bits_in_big_integer(String numberStr, int expectedCount) {
        BigInteger number = new BigInteger(numberStr);
        CountSetBits countSetBits = new CountSetBits(number);
        int count = countSetBits.calculate____();
        Assertions.assertThat(expectedCount).isEqualTo(count);
    }
}