package com.leetcode;

public class MonotonicNumber {

    public boolean isMonotonic(int[] numbers) {
        int increase = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (index + 1 == numbers.length) break;
            if (numbers[index] - numbers[index + 1] <= 0 ||numbers[index] - numbers[index + 1] >= 0 )
                increase++;
        }
        return increase > 0;
    }
}
