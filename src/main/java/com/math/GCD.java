package com.math;

public class GCD {
    private static int gcdNaive(int firstNumber, int secondNumber) {
        int gc = 0;
        int min = Math.min(firstNumber, secondNumber);
        for (int index = 2; index <= min; index++) {
            if (firstNumber % index == 0 && secondNumber % index == 0) {
                gc = index;
            }
        }
        return gc;
        //todo  Worst-case O ( min ( a, b ) ) -> o(n)
    }

    private static int gcdEuclidean(int a, int b) {
        int temp;

        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public static void main(String[] args) {
        System.out.println(gcdEuclidean(8, 12));
        System.out.println(gcdEuclidean(12, 8));
    }
}
