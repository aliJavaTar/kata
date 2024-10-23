package com.data_structure.bit.binery;

public record RightmostDifferentBit(int firstNumber, int secondNumber) {

    public int find() {
        String binaryString = Integer.toBinaryString(firstNumber ^ secondNumber);
        int index = new StringBuilder(binaryString).reverse().toString().indexOf("1");
        if (index == -1)
            return index;
        return index + 1;

    }
}
