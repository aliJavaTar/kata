package com.data_structure.bit.binery.xor;

public class TwoOddOccurring {

    public static int countBitFlips(int firstNumber, int soundNumber) {
        int xorResult = firstNumber ^ soundNumber;
        return (int) Integer.toBinaryString(xorResult).chars().filter(character -> character == '1').count();
    }
}
