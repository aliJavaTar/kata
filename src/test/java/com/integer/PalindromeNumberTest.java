package com.integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void isPalindrome() {
        assertTrue(new PalindromeNumber().isPalindrome(121));
        assertTrue(new PalindromeNumber().isPalindrome(1221));
        assertTrue(new PalindromeNumber().isPalindrome(11));
        assertFalse(new PalindromeNumber().isPalindrome(12141));
    }
}