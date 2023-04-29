package com.codeWars.six.MillipedeOfWords;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MillipedeShould {

    @Test
    void the_last_letter_of_one_word_and_the_first_letter_of_another_word_are_the_same()
    {
        Millipede millipede = new Millipede();
        String[] message = {"ali", "light", "tolerant"};
        Assertions.assertTrue(millipede.checkWords(message));
    }

}