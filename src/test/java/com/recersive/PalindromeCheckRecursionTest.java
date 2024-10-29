package com.recersive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeCheckRecursionTest {

    @ParameterizedTest
    @ValueSource(strings = {"a", "bb" , "ccc" ,"aia"})
    void isPalindrome(String input) {
        var palindromeCheckRecursion = new PalindromeCheckRecursion();
        boolean result = palindromeCheckRecursion.isPalindrome(input);
        Assertions.assertThat(result).isTrue();
    }
}