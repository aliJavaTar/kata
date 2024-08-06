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

//    public int calculate(int a, int b) {
//        while (a != b) {
//            if (a > b)
//                a = a - b;
//            else
//                b = b - a;
//        }
//
//        return a;
//    }

    public int calculate(int a, int b)
    {
        if(b==0)
            return a;

        return calculate(b, a % b);
    }
}
