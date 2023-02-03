package com.codeWars.reversesWords;

import org.junit.jupiter.api.BeforeEach;
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
    void reversWords_Should_Give_One_Character(String value) {
        String actual = words.reversWords(value);
        assertThat(actual).isEqualTo(value);
    }
}