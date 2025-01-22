package com.tdd.roman;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class RomanNumeralsTest {

    @Test
    void convert_arabic_number_to_roman_number() {

        Assertions.assertThat(new RomanNumber(1).convert()).isEqualTo("I");
        Assertions.assertThat(new RomanNumber(2).convert()).isEqualTo("II");
        Assertions.assertThat(new RomanNumber(3).convert()).isEqualTo("III");
        Assertions.assertThat(new RomanNumber(5).convert()).isEqualTo("V");
        Assertions.assertThat(new RomanNumber(6).convert()).isEqualTo("VI");
        Assertions.assertThat(new RomanNumber(7).convert()).isEqualTo("VII");
        Assertions.assertThat(new RomanNumber(8).convert()).isEqualTo("VIII");
        Assertions.assertThat(new RomanNumber(10).convert()).isEqualTo("X");
        Assertions.assertThat(new RomanNumber(20).convert()).isEqualTo("XX");
    }
}