package com.leetcode;

public class MonotonicArray {
    private final MonotonicNumber increaseNumber = new MonotonicNumber();
    private final SloppyNumber sloppyNumber = new SloppyNumber();

    public boolean isMonotonic(int[] nums) {
      return increaseNumber.isMonotonic(nums) && !sloppyNumber.isSloppy(nums) ;
    }


}
