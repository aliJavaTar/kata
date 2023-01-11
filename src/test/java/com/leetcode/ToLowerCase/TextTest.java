package com.leetcode.ToLowerCase;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TextTest {
    private Text text;

    @BeforeEach
    void setUp() {
        text = new Text();
    }

    @Test
    void should_give_message_when_text_is_empty() {

        String name = " ";

        String convertToLowerCase = text.toLowerCase(name);

        Assertions.assertThat(convertToLowerCase)
                .isEqualTo("you must enter a text");
    }
}