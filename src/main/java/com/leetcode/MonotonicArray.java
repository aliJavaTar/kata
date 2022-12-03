package com.leetcode;

public class MonotonicArray {

    public boolean isMonotonic(int[] nums) {
//        return decreasing(nums);
        return increase(nums);


    }

    private boolean increase(int[] numbers) {
        boolean test = false;
        for (int index = 0; index < numbers.length; index++) {
            if (index + 1 == numbers.length) return true;
            if (!(numbers[index] <= numbers[index + 1])) {
                test = false;
            } else if (!(numbers[index] <= numbers[index + 1])) {
                test = true;
            }
        }
        return test;
    }


}
