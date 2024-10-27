package com.data_structure.bit.binery;

public class CountTotalSetBits {
    private int number;

    public CountTotalSetBits(int number) {
        this.number = number;
    }

    public int count() {
        int count = 0;
        int index = number;
        while (number > 0) {
            while (index > 0) {
                count += index & 1;
                index >>= 1;
            }
            number--;
            index = number;
        }
        return count;
    }
}
