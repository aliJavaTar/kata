package com.leetcode.easy;

public class TowSum {
    public int[] sum(int[] numbers, int target) {
        int count = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (count < numbers.length && numbers[index] + numbers[++count] != target)
                count++;
            else return new int[]{index, count};
        }
        return numbers;
    }
}
