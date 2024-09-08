package com.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddStringTest {
    @Test
    public void test() {
        AddString addStrings = new AddString();
        String number = addStrings.addStrings("21349", "235");
        assertEquals("2", number);

    }
}