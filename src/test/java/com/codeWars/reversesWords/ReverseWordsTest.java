package com.codeWars.reversesWords;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseWordsTest {
    private ReverseWords words;

    @BeforeEach
    void setUp() {
        words = new ReverseWords();
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "b", "c"})
    void reversWords_Should_Give_Two_Character(String value) {
        String actual = words.reversWords(value);
        assertThat(actual).isEqualTo(value);
    }

    @Test
    void reversWords_Should_Give_Two_Character() {
        String actual = words.reversWords("ab");
        assertThat(actual).isEqualTo("ba");
    }

    @Test
    void reversWords_Should_Give_Five_Character() {
        String actual = words.reversWords("abcd");
        assertThat(actual).isEqualTo("dcba");
    }

}