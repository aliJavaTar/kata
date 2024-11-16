package com.data_structure.bit.binery;

public record SwapBits(int number) {
    public int getNumber() {

        int EVEN_MASK = 0xAAAAAAAA;
        int ODD_MASK = 0x55555555;

        int evenBits = (number & EVEN_MASK) >> 1;
        int oddBits = (number & ODD_MASK) << 1;

        return evenBits | oddBits;
    }
}
