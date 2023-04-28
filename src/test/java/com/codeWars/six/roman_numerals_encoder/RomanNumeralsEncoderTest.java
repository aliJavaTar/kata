package com.codeWars.six.roman_numerals_encoder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RomanNumeralsEncoderTest {


    @Test
    void should_convert_Arabic_number_to_roam_numerals() {
        assertThat(new RomanNumeralsEncoder(1).converter()).isEqualTo("I");
        assertThat(new RomanNumeralsEncoder(2).converter()).isEqualTo("II");
        assertThat(new RomanNumeralsEncoder(3).converter()).isEqualTo("III");

        assertThat(new RomanNumeralsEncoder(5).converter()).isEqualTo("V");
        assertThat(new RomanNumeralsEncoder(6).converter()).isEqualTo("VI");
        assertThat(new RomanNumeralsEncoder(7).converter()).isEqualTo("VII");
        assertThat(new RomanNumeralsEncoder(8).converter()).isEqualTo("VIII");


        assertThat(new RomanNumeralsEncoder(10).converter()).isEqualTo("X");
        assertThat(new RomanNumeralsEncoder(11).converter()).isEqualTo("XI");
        assertThat(new RomanNumeralsEncoder(12).converter()).isEqualTo("XII");
        assertThat(new RomanNumeralsEncoder(13).converter()).isEqualTo("XIII");

        assertThat(new RomanNumeralsEncoder(20).converter()).isEqualTo("XX");
        assertThat(new RomanNumeralsEncoder(30).converter()).isEqualTo("XXX");


        assertThat(new RomanNumeralsEncoder(50).converter()).isEqualTo("L");
        assertThat(new RomanNumeralsEncoder(60).converter()).isEqualTo("LX");
        assertThat(new RomanNumeralsEncoder(70).converter()).isEqualTo("LXX");
        assertThat(new RomanNumeralsEncoder(80).converter()).isEqualTo("LXXX");


    }

}