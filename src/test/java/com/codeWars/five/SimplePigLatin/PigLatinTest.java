package com.codeWars.five.SimplePigLatin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PigLatinTest {

    @Test
    void should_Move_the_first_letter_of_each_word_to_the_end_of_it_then_add_ay_to_the_end_of_the_word() {
        PigLatin pigLatin = new PigLatin();


        assertThat(pigLatin.pigIt("This")).isEqualTo("hisTay");

        assertThat(pigLatin.pigIt("Pig latin is cool")).isEqualTo("igPay atinlay siay oolcay");

        assertThat(pigLatin.pigIt("This is my string")).isEqualTo("hisTay siay ymay tringsay");

        assertThat(pigLatin.pigIt("Hello world !")).isEqualTo("elloHay orldway !");

    }
}