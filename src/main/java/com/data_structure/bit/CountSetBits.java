package com.data_structure.bit;


import java.math.BigInteger;

public record CountSetBits(BigInteger number) {
    public int calculate() {
        int count = 0;
        BigInteger current = number;

        while (current.compareTo(BigInteger.ZERO) > 0) {
            if (current.testBit(0)) {
                count++;
            }
            current = current.shiftRight(1);
        }
        return count;
    }
}
