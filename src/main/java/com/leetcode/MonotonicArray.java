package com.leetcode;

public class MonotonicArray {

    public boolean isMonotonic(int[] nums) {

        return increase(nums);


    }

    private boolean increase(int[] nums) {

        int increase = 0;
        int decreasing = 0;
        for (int index = 0; index < nums.length; index++) {
            if (index + 1 == nums.length) break;
            if ((nums[index] - nums[index + 1]) >= 1) {
                increase++;
            }
            if ((nums[index] - nums[index + 1]) <= -1) {
                decreasing++;
            }
        }
        if (increase == 0 && decreasing == 0)
            return true;

        return decreasing != increase;

    }

}
