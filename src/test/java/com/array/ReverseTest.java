package com.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverseString() {
        new Reverse().reverseString(new char[]{'n','e','e','t'});
    }
}