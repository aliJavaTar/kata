package com.codeWars.six.roman_numerals_encoder;

public class RomanNumeralsEncoder {


    public String converter(int number) {
        StringBuilder romaNumerals = new StringBuilder();
        if (number >= 50) {
            romaNumerals.append("L");
            number -= 50;
        }
        while (number >= 10) {
            romaNumerals.append("X");
            number -= 10;
        }
        if (number >= 5) {
            romaNumerals.append("V");
            number -= 5;
        }

        for (int index = 0; index < number; index++) {
            romaNumerals.append("I");
        }
        return romaNumerals.toString();

    }
}
