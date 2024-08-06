package com.math;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GreatestCommonDivisorShould {
    @Test
    void give_two_number_and_calculate_greatest_common_divisor() {
        var greatestCommonDivisor = new GreatestCommonDivisor(2, 2);
        int result = greatestCommonDivisor.calculate();
        Assertions.assertThat(result).isEqualTo(2);

        greatestCommonDivisor = new GreatestCommonDivisor(2, 4);
        result = greatestCommonDivisor.calculate();
        Assertions.assertThat(result).isEqualTo(2);

        greatestCommonDivisor = new GreatestCommonDivisor(4, 8);
        result = greatestCommonDivisor.calculate();
        Assertions.assertThat(result).isEqualTo(4);

        greatestCommonDivisor = new GreatestCommonDivisor(98, 56);
        result = greatestCommonDivisor.calculate();
        Assertions.assertThat(result).isEqualTo(14);
    }
}