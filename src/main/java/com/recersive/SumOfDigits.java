package com.recersive;

public class SumOfDigits {
    public int calculateSumOfDigits(int input) {
        if (input == 0)
            return 0;
        return input % 10 + calculateSumOfDigits(input / 10);
    }
}
