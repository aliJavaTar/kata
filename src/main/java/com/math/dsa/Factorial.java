package com.math.dsa;

public record Factorial(Integer number) {
    private static final int ZERO = 0;
    private static final int ONE = 1;

    public int calculate() {
        int temp = ONE;
        if (number == ZERO || number == ONE) {
            return ONE;
        }
        for (int index = number; index > ONE; index--) {
            temp *= index;
        }
        return temp;
    }

}
