package com.codeWars.six.roman_numerals_encoder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RomanNumeralsEncoderTest {
    private RomanNumeralsEncoder encoder;

    @BeforeEach
    void setUp() {
        encoder = new RomanNumeralsEncoder();
    }

    @Test
    void should_convert_Arabic_number_to_roam_numerals() {

        assertThat(encoder.converter(1)).isEqualTo("I");
        assertThat(encoder.converter(2)).isEqualTo("II");
        assertThat(encoder.converter(3)).isEqualTo("III");

        assertThat(encoder.converter(5)).isEqualTo("V");
        assertThat(encoder.converter(6)).isEqualTo("VI");
        assertThat(encoder.converter(7)).isEqualTo("VII");
        assertThat(encoder.converter(8)).isEqualTo("VIII");


        assertThat(encoder.converter(10)).isEqualTo("X");
        assertThat(encoder.converter(11)).isEqualTo("XI");
        assertThat(encoder.converter(12)).isEqualTo("XII");
        assertThat(encoder.converter(13)).isEqualTo("XIII");

        assertThat(encoder.converter(20)).isEqualTo("XX");
        assertThat(encoder.converter(30)).isEqualTo("XXX");


        assertThat(encoder.converter(50)).isEqualTo("L");
        assertThat(encoder.converter(60)).isEqualTo("LX");
        assertThat(encoder.converter(70)).isEqualTo("LXX");
        assertThat(encoder.converter(80)).isEqualTo("LXXX");



    }

}