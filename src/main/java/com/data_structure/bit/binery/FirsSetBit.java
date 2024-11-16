package com.data_structure.bit.binery;

public class FirsSetBit {
    private int number;

    public FirsSetBit(int number) {
        this.number = number;
    }

    public int find() {
        while (number > 0) {
            number = number >> 1;

        }
        return number;
    }
}
