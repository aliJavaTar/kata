package com.recersive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeCheckRecursionTest {

    @ParameterizedTest
    @ValueSource(strings = {"a"})
    void isPalindrome(String input) {
        var palindromeCheckRecursion = new PalindromeCheckRecursion();
        boolean result = palindromeCheckRecursion.isValid(input);
        Assertions.assertThat(result).isTrue();
    }
}