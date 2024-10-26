package com.data_structure.bit.binery;

import java.util.Arrays;

public class LongestConsecutiveOne {
    public static final String SPLIT_BY_ZERO = "0";
    private int number;

    public LongestConsecutiveOne(int number) {
        this.number = number;
    }

    public int calculateMustSequenceOne() {
        int count = 0;
        while (number!=0) {
            number = (number & (number << 1));
            count++;
        }
        return count;
    }


    public int calculateMustSequenceOne_() {
        String[] array = Integer.toBinaryString(number).split(SPLIT_BY_ZERO);
        return Arrays.stream(array).mapToInt(String::length).max().orElse(0);
    }
}