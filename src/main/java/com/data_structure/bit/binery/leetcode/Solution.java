package com.data_structure.bit.binery.leetcode;

import java.util.stream.IntStream;

public record Solution(int number) {
    public boolean calculate(int number) {

        return (number & (number >> 1)) == 0;
    }
}

