package com.codeWars;

public class CalculatePowOfArray {
    public int calculate(int[] array, int number) {
        if (array.length >= number) {
            int num = array[number];
            int pow = 1;

            for (int index = 1; index <= number; index++) {
                pow = num * pow;
            }
            return pow;
        } return -1;


    }
}
