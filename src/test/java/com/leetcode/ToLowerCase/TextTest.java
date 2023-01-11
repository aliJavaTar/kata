package com.leetcode.ToLowerCase;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

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

        assertThat(convertToLowerCase)
                .isEqualTo("you must enter a text");
    }

    @Test
    void should_convert_text_to_LowerCase() {

        String nameTest1 = "ALI";
        String nameTest2 = "GHOLAM";
        String nameTest3 = "MOdaf";
        String nameTest4 = "JAFAR";

         text.toLowerCase(nameTest2);
         text.toLowerCase(nameTest3);
         text.toLowerCase(nameTest4);

         assertThat(text.toLowerCase(nameTest1)).isEqualTo("ali");
         assertThat(text.toLowerCase(nameTest2)).isEqualTo("gholam");
         assertThat(text.toLowerCase(nameTest3)).isEqualTo("modaf");
         assertThat(text.toLowerCase(nameTest4)).isEqualTo("jafar");
    }
}