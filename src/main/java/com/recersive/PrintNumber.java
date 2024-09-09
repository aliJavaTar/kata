package com.recersive;

public class PrintNumber {

    public void print(int value) {
        for (int index = value; index > 0; index--) {
            System.out.println(index);
        }
    }

    public void printReversion(int value) {
        if (value == 0)
            return;
        System.out.println(value);
        printReversion(value - 1);
    }
}
