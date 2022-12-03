package com.leetcode;

public class MonotonicArray {

    public boolean isMonotonic(int[] nums) {

        for (int index = 0; index < nums.length; index++) {
            if (index + 1 == nums.length) return true;
            if (!(nums[index] <= nums[index + 1])) {
                return false;
            }
        }
        return true;
    }
}
