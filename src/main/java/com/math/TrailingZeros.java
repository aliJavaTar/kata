package com.math;

public record TrailingZeros(int number) {
    public int count() {
        int count = 0;
        if (number < 0) {
            return -1;
        }

        for (int i = 5; number / i >= 1; i *= 5)
            count += number / i;

        return count;
    }
}
