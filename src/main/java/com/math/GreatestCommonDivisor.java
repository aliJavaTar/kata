package com.math;

public record GreatestCommonDivisor(int firstNumber, int secondNumber) {

    public int calculate() {
        int min = Math.min(firstNumber, secondNumber);
        while (min > 0) {
            if (firstNumber % min == 0 && secondNumber % min == 0) {
                break;
            }
            min--;
        }
        return min;
    }
}
