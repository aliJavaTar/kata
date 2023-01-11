package com.leetcode;

public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
//        return decreasing(nums);
        boolean test = false;
        for (int index = 0; index < nums.length; index++) {
            if (index + 1 == nums.length) return test;

            if (nums[index] - nums[index + 1] <= -1 || nums[index] - nums[index + 1] == 0 || nums[index] - nums[index + 1] <= 1)
                test = true;
            else return false;
        }
        return test;
    }
}
