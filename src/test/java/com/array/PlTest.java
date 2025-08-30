package com.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlTest {

    @Test
    void isPalindrome() {
        Assertions.assertTrue(new Pl().isPalindrome("Was it a car or a cat I saw?"));
        Assertions.assertFalse(new Pl().isPalindrome("0P"));
        Assertions.assertFalse(new Pl().isPalindrome(")P"));
    }

}