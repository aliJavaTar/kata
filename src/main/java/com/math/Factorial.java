package com.math;

public record Factorial(int number) {

    public int calculateFactorialOfNumber() {
        int result = 1;
        for (int index = number; index > 0; index--) {
            result *= index;
        }
        return result;
    }
}
