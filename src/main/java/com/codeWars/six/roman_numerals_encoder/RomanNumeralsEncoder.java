package com.codeWars.six.roman_numerals_encoder;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralsEncoder {

    private final Map<Integer, String> romanNumeralMap;
    private int arabicNumber;

    public RomanNumeralsEncoder(int arabicNumber) {
        this.arabicNumber = arabicNumber;
        romanNumeralMap = new LinkedHashMap<>();
        romanNumeralMap.put(5, "V");
        romanNumeralMap.put(10, "X");
        romanNumeralMap.put(50, "L");
    }

    public String converter() {
        StringBuilder romaNumerals = new StringBuilder();
        romaNumerals.append(extracted(50));
        romaNumerals.append(extracted(10));
        romaNumerals.append(extracted(5));

        for (int index = 0; index < arabicNumber; index++) {
            romaNumerals.append("I");
        }
        return romaNumerals.toString();

    }

    private StringBuilder extracted(int i) {
        StringBuilder romaNumerals = new StringBuilder();
        while (arabicNumber >= i) {
            romaNumerals.append(romanNumeralMap.get(i));
            arabicNumber -= i;
        }
        return romaNumerals;
    }
}
