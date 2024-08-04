package com.math;


public record Count(int number) {

    public int calculateCountOfDigit() {
        if (number / 10 == 0)
            return 1;
        return (int) Math.floor(Math.log10(number)) + 1;
    }

    public int calculateCountOfDigitAnotherWay(int number) {
        if (number / 10 == 0) return 1;
        return 1 + calculateCountOfDigitAnotherWay(number / 10);
    }

    public int calculateCountOfDigitAnotherWay2(int number) {
        int count = 0;
        if (number / 10 == 0) return 1;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }
}
