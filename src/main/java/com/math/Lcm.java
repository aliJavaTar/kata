package com.math;

public record Lcm(int firstNumber, int secondNumber) {

    public int calculate() {
        int gcdNumber =
                new GreatestCommonDivisor(firstNumber, secondNumber).calculate();
        return (firstNumber * secondNumber) / gcdNumber;
    }
}
