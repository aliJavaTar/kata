package com.codeWars;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatItTest {
    @Test
    void shouldGiveMessage_Not_a_string_WhenToRepeatIsNotString() {
        RepeatIt repeat = new RepeatIt();

        String message = repeat.repeatString(23, 11);

        Assertions.assertThat(message).isEqualTo("Not a string");
    }

    @Test
    void shouldGiveWhenToRepeatIsNotString() {
        RepeatIt repeat = new RepeatIt();

        String message = repeat.repeatString(23, 11);

        Assertions.assertThat(message).isEqualTo("Not a string");
    }
}