package com.codeforces;

import java.util.Scanner;

public class Pow {
    private final int firstNumber;
    private final int secondNumber;

    public Pow(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int calculate() {
        int powOne = 1;
        int powTwo = 1;
        for (int index = 0; index < secondNumber; index++) {
            powOne *= firstNumber;
        }
        for (int index = 0; index < firstNumber; index++) {
            powTwo *= secondNumber;
        }
        return powOne - powTwo;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first firstNumber: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second firstNumber: ");
        int secondNumber = scanner.nextInt();

        Pow pow = new Pow(firstNumber, secondNumber);
        int result = pow.calculate();

        System.out.println("ab - ba = " + result);
    }
}
