package com.data_structure.bit;


import java.math.BigInteger;
import java.util.BitSet;

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

    public int calculate_() {
        int count = 0;
        int current = number.intValue();

        while (current > 0) {
            count += current & 1;
            current >>= 1;
        }
        return count;
    }

    public int calculate____() {
        int count = 0;
        int current = number.intValue();

        while (current > 0) {
            current &= (current - 1);
            count++;
        }
        return count;
    }

    public int calculate__() {

        int[] BitsSetTable256 = new int[256];

        int count = 0;
        int current = number.intValue();

        while (current > 0) {
            count += current & 1;
            current >>= 1;
        }
        return count;
    }
}



