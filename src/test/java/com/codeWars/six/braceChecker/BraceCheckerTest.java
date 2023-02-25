package com.codeWars.six.braceChecker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BraceCheckerTest {
    @Test
    void should_give_true_when_order_of_the_braces_is_valid() {

        BraceChecker brace = new BraceChecker();
        boolean valid = brace.isValid("(");
        Assertions.assertFalse(valid);

    }
}