package com.data_structure.bit;

public class Test {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(Integer.toBinaryString(number));
        int shiftToRight = number >> 1;
        System.out.println(Integer.toBinaryString(shiftToRight));
        int shiftToLeft = number << 1;
        System.out.println(Integer.toBinaryString(shiftToLeft));
    }
}
