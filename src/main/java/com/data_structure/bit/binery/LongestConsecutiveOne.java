package com.data_structure.bit.binery;

public class LongestConsecutiveOne {
    private int number;

    public LongestConsecutiveOne(int number) {
        this.number = number;
    }

    public int calculateMustSequenceOne() {
        int count = 0;
        int maxCount = 0;
        while (number > 0) {
            if ((number & 1) == 1) {
                count++;
                maxCount = Math.max(count, maxCount);
            }
            number >>= 1;
        }
        return maxCount;
    }
}
