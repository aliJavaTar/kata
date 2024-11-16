package com.data_structure.bit.binery;



public record FindKthBitInNthBinaryString(int number, int key) {

    public boolean findKthBit() {
        int mask = 1 << key;
        return (number & mask) != 0;
    }
}
