package com.leetcode;

public class SloppyNumber {
    int incre;
    int desc;

    public boolean isSloppy(int[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            if (index + 2 == numbers.length) break;

            if (numbers[index] - numbers[index + 1] >= 0)
                incre++;
            else desc++;

            if (numbers[index + 1] - numbers[index + 2] >= 0)
                incre++;
            else desc++;

            if (incre - desc == 0)
                return true;
        }
        return false;
    }
}
