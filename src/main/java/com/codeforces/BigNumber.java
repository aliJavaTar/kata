package com.codeforces;

import java.util.Objects;

public class BigNumber {


    private final String number;

    public BigNumber(String number) {
        isNumber();
        this.number = number;
    }

    public BigNumber add(BigNumber other) {
        // Ensure firstNumber is the longer one
        String firstNumber = this.number;
        String secondNumber = other.number;
        if (secondNumber.length() > firstNumber.length()) {
            String temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }

        // Reverse both strings
        firstNumber = new StringBuilder(firstNumber).reverse().toString();
        secondNumber = new StringBuilder(secondNumber).reverse().toString();

        StringBuilder sumBuilder = new StringBuilder();
        int carryOver = 0;
        int lengthFirstNumber = firstNumber.length();
        int lengthSecondNumber = secondNumber.length();

        for (int i = 0; i < lengthFirstNumber; i++) {
            int digitFirstNumber = firstNumber.charAt(i) - '0';
            int digitSecondNumber = i < lengthSecondNumber ? secondNumber.charAt(i) - '0' : 0;

            int sum = digitFirstNumber + digitSecondNumber + carryOver;
            sumBuilder.append(sum % 10);
            carryOver = sum / 10;
        }

        if (carryOver != 0) {
            sumBuilder.append(carryOver);
        }

        // Reverse the result string to get the final sum
        return new BigNumber(sumBuilder.reverse().toString());
    }


    private void isNumber() {
        if (Objects.isNull(number))
            return;

        boolean hasNonDigit = number.chars().anyMatch(ch -> !Character.isDigit(ch));
        if (hasNonDigit)
            throw new IllegalArgumentException("Invalid number");
    }


}
