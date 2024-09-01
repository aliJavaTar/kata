package com.codeforces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AddStringTest {

    public static final String FORMAT = "Addition of %s and %s should be %s";

    @ParameterizedTest
    @CsvSource({
            "123, 456, 579",
            "-123, 456, 333",
            "123, -456, -333",
            "-123, -456, -579",
            "0, 0, 0",
            "0, 123, 123",
            "123, 0, 123",
            "-123, 0, -123"
    })
    void testAddition(String firstNumber, String secundNumber, String expected) {
        AddString a = new AddString(firstNumber);
        AddString b = new AddString(secundNumber);
        assertEquals(new AddString(expected), a.add(b), String.format(FORMAT, firstNumber, secundNumber, expected));
    }
}