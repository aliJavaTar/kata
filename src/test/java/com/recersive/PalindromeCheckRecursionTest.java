package com.recersive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeCheckRecursionTest {

    @Test
    void isPalindrome() {
        var palindromeCheckRecursion = new PalindromeCheckRecursion();
        boolean result = palindromeCheckRecursion.isValid();
        Assertions.assertThat(result).isTrue();
    }
}