package com.leetcode;

public class Solution {
    private final MonotonicNumber increaseNumber = new MonotonicNumber();
    private final SloppyNumber sloppyNumber = new SloppyNumber();

    public boolean isMonotonic(int[] nums) {
        return increaseNumber.isMonotonic(nums) && !sloppyNumber.isSloppy(nums);
    }


}

class MonotonicNumber {

    public boolean isMonotonic(int[] numbers) {
        int increase = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (index + 1 == numbers.length) break;
            if (numbers[index] - numbers[index + 1] <= 0 || numbers[index] - numbers[index + 1] >= 0)
                increase++;
        }
        return increase > 0;
    }
}

class SloppyNumber {
    int incre;
    int desc;

             //[1,2,2,3]
    public boolean isSloppy(int[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            if (index + 2 == numbers.length) break;
           // 1 - 2 --> desc ++
            if (numbers[index] - numbers[index + 1] >= 0)
                incre++;
            else desc++;

            if (numbers[index + 1] - numbers[index + 2] >= 0)
                incre++; //incre ++
            else desc++;

            if (incre - desc == 0)
                return true;
        }
        return false;
    }
}

