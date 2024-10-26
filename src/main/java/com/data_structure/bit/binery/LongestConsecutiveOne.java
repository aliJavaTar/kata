package com.data_structure.bit.binery;

import java.io.InputStream;
import java.util.stream.IntStream;

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
            count = 0;
        }
        return maxCount;
    }

    public int calculateMustSequenceOne_() {
        int count = 0;
        String binaryString = Integer.toBinaryString(number);
        int max = 0;
        for (int index = 0; index < binaryString.length(); index++) {
            if (binaryString.charAt(index) == '1')
                count++;
            if (binaryString.charAt(index) == '0')
                count = 0;

            max = Math.max(count, max);
        }
        return max;
    }
}