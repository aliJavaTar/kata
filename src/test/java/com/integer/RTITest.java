package com.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RTITest {

    RTI rti = new RTI();

    @ParameterizedTest
    @CsvSource({
            // Easy: 1–10
            "I, 1",
            "II, 2",
            "III, 3",
            "V, 5",
            "VI, 6",
            "VIII, 8",
            "X, 10",
//
//            // Teens and twenties
            "XI, 11",
            "XIV, 14",
            "XV, 15",
            "XIX, 19",
            "XX, 20",
            "XXVII, 27",
//
//            // Thirties and mid-range
            "XXX, 30",
            "XXXV, 35",
//
            // Higher values
            "XL, 40",
            "XLIV, 44",
            "XLIX, 49",
            "L, 50"
    })
    void testRomanNumerals(String input, int expected) {
        assertEquals(expected, rti.romanToInt(input));
    }
}
