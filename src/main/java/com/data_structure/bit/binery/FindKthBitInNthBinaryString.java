package com.data_structure.bit.binery;

import java.util.stream.IntStream;

public record FindKthBitInNthBinaryString(int number, int key) {

    public boolean findKthBit() {
        int mask = 1 << key;
        return (number & mask) != 0;
    }
}
