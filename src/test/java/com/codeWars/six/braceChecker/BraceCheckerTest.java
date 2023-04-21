package com.codeWars.six.braceChecker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class BraceCheckerTest {
    private BraceChecker brace;

    @BeforeEach
    void setUp() {
        brace = new BraceChecker();
    }

    @ParameterizedTest
    @ValueSource(strings = {"(", ")", "}", "{", "[", "]"})
    void should_give_false_when_order_of_the_braces_is_not_valid_Whit_one_character(String value) {
        assertFalse(brace.isValid(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"()", "{}", "[]"})
    void should_give_true_when_order_of_the_braces_is_not_valid_whit_two_character(String value) {
        assertTrue(brace.isValid(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {")(", "}{", "]["})
    void should_give_false_when_order_of_the_braces_is_not_valid_Whit_two__character(String value) {
        assertFalse(brace.isValid(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {")(", "}{", "]["})
    void should_give_true_when_order_of_the_braces_is_not_valid_Whit_many_character(String value) {
        assertFalse(brace.isValid(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"[({})](]", "[({})](]","[(])"})
    void should_give_false_when_order_of_the_braces_is_not_valid_braces(String value) {
        assertFalse(brace.isValid(value));

    }

}