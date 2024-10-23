package com.data_structure.bit.binery;

public record RightmostDifferentBit(int firstNumber, int secondNumber) {

    public int find() {
        if ((firstNumber & secondNumber) == 0)
            return -1;
        return 0;
    }
}
