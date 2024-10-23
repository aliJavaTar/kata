package com.data_structure.bit.binery;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapBitsShould {

    @Test
    void show_number_after_swap_even_bit_to_odd() {
        var swapBits = new SwapBits(2);
        int result = swapBits.getNumber();
        Assertions.assertThat(result).isEqualTo(1);

        swapBits = new SwapBits(4);
        result = swapBits.getNumber();
        Assertions.assertThat(result).isEqualTo(8);
    }
}