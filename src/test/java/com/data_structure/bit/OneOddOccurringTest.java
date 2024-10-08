package com.data_structure.bit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneOddOccurringTest {

    @Test
    void find_number() {
        int[] numbers = {1, 2, 3, 2, 3, 1, 3};
        var oneOddOccurring = new OneOddOccurring(numbers);
        int result = oneOddOccurring.findNumber();
        Assertions.assertThat(result).isEqualTo(3);
    }
}