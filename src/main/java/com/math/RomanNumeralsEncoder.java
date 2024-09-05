package com.math;

public class RomanNumeralsEncoder {

    public String encode(int number) {
        String result = "";

        if (number >= 50) {
            int i = number / 10;
            for (int j = 0; j < i; j+=5) {
                result += "L";
                number -= 50;
            }
        }

        if (number <= 40) {
            int i = number / 10;
            for (int j = 0; j < i; j++) {
                result += "X";
                number -= 10;
            }
        }

        if (number >= 5) {
            result += "V";
            number -= 5;
        }
        if (number <= 3) {
            int i = number % 10;
            for (int j = 0; j < i; j++) {
                result += "I";
            }
        }


        return result;
    }
}
