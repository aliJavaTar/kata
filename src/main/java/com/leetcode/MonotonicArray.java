package com.leetcode;

public class MonotonicArray {

    public boolean isMonotonic(int[] nums) {
//        return decreasing(nums);
        return increase(nums);


    }

    private boolean increase(int[] numbers) {
        boolean test = false;
        for (int index = 0; index < numbers.length; index++) {
            if (index + 1 == numbers.length) return test;
            if (numbers[index] - numbers[index + 1] == -1 || numbers[index] - numbers[index + 1] == 0 || numbers[index] - numbers[index + 1] == 1)
                test = true;
            else return false;
        }
        return test;
    }

//    private boolean decreasing(int[] numbers) {
//        for (int index = 0; index < numbers.length; index++) {
//            if (index + 1 == numbers.length) return true;
//            if (!(numbers[index] <= numbers[index + 1])) {
//                return true;
//            }
//        }
//        return false;
//    }
}
