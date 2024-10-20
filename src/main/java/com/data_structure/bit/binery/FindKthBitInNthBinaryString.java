package com.data_structure.bit.binery;

import java.util.stream.IntStream;

public record FindKthBitInNthBinaryString(int number, int key) {

    public int findKthBit() {
        String binaryString = Integer.toBinaryString(number);
        StringBuilder binaryText = new StringBuilder(binaryString);
        StringBuilder reverse = binaryText.reverse();
        return IntStream.range(0, reverse.length() - 1).filter(value -> value == key).findFirst().orElse(0);
    }
}
