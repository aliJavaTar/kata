package com.integer;

public class FTZ {
    public int trailingZeroes(int input) {
        int count = 0;

        for (int i = 2; i <= input; i++) {
            count += countFactor(i);
        }

        return count;
    }

    private int countFactor(int input) {

        int count = 0;
        while (input % 5 == 0) {
            count++;
            input = input / 5;
        }

        return count;

    }
}
