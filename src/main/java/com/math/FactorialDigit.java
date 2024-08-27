package com.math;

import java.math.BigDecimal;

public class FactorialDigit {

    public static long calculate(int number) {
        var factorial = new Factorial(number);
        var calculated = factorial.calculateFactorialOfNumber();
        int count = 0;
        while (calculated.intValue() > 0) {
            calculated = BigDecimal.valueOf(calculated.intValue() / 10);
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(calculate(42));
    }
}
