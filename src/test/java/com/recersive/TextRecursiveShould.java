package com.recersive;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TextRecursiveShould {

    @Test
    void reversText() {
        var textRecursive = new TextRecursive();
        String result = textRecursive.reverse("farnam");

        assertThat(result).isEqualTo("manraf");
    }

}