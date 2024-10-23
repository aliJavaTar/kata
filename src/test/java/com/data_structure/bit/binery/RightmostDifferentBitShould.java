package com.data_structure.bit.binery;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RightmostDifferentBitShould {

    @Test
    void find_the_position_of_the_rightmost_different_bit_in_the_binary_representation() {
        int firstNumber = 0;
        int secondNumber = 0;
        var rightmostDifferentBit = new RightmostDifferentBit(firstNumber, secondNumber);
        int result = rightmostDifferentBit.find();
        Assertions.assertThat(result).isEqualTo(-1);
    }
}