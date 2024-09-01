package com.codeforces;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigIntTest {

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
    void testAddition(String num1, String num2, String expected) {
        BigInt a = new BigInt(num1);
        BigInt b = new BigInt(num2);
        assertEquals(new BigInt(expected), a.add(b), String.format("Addition of %s and %s should be %s", num1, num2, expected));
    }

    @ParameterizedTest
    @CsvSource({
            "456, 123, 333",
            "456, -123, 579",
            "-456, 123, -579",
            "-456, -123, -333",
            "123, 123, 0",
            "123, -123, 246",
            "-123, 123, -246",
            "-123, -123, 0"
    })
    void testSubtraction(String num1, String num2, String expected) {
        BigInt a = new BigInt(num1);
        BigInt b = new BigInt(num2);
        assertEquals(new BigInt(expected), a.subtract(b), String.format("Subtraction of %s from %s should be %s",
                num2, num1, expected));
    }

    @ParameterizedTest
    @CsvSource({
            "123, 123, false",
            "123, 321, true",
            "-123, 123, true",
            "-123, -123, false"
    })
    void testLessThan(String num1, String num2, boolean expected) {
        BigInt a = new BigInt(num1);
        BigInt b = new BigInt(num2);
        assertEquals(expected, a.lessThan(b), String.format("Comparing %s and %s should be %s", num1, num2, expected));
    }

    @ParameterizedTest
    @CsvSource({
            "123, 124",
            "0, 1",
            "-123, -122",
            "456, 457",
            "999, 1000",
            "-999, -998",
            "-1, 0"
    })
    void testIncrement(String initial, String expected) {
        BigInt num = new BigInt(initial);
        BigInt result = num.increment();
        BigInt expectedBigInt = new BigInt(expected);
        assertEquals(expectedBigInt, result, String.format("Increment of %s should be %s", initial, expected));
    }

    @ParameterizedTest
    @CsvSource({
            "123, 122",
            "0, -1",
            "-123, -124",
            "456, 455",
            "1000, 999",
            "-1000, -1001",
            "1, 0",
            "0, -1"
    })
    void testDecrement(String initial, String expected) {
        BigInt num = new BigInt(initial);
        BigInt result = num.decrement();
        BigInt expectedBigInt = new BigInt(expected);
        assertEquals(expectedBigInt, result, String.format("Decrement of %s should be %s", initial, expected));
    }
}