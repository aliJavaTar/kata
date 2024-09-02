package com.old.leetcode.easy;

public record AddStrings(String firstNumber, String secondNumber) {

    public static final int TEN = 10;

    public String add() {
        int lastIndexOfFirst = firstNumber.length() - 1;
        int lastIndexOfSecond = secondNumber.length() - 1;
        int carry = 0;
        var stringBuilder = new StringBuilder();

        while (lastIndexOfFirst >= 0 || lastIndexOfSecond >= 0 || carry == 1) {
            if (lastIndexOfFirst >= 0) {
                carry += firstNumber.charAt(lastIndexOfFirst) - '0';
                lastIndexOfFirst--;
            }
            if (lastIndexOfSecond >= 0) {
                carry += secondNumber.charAt(lastIndexOfSecond) - '0';
                lastIndexOfSecond--;
            }
            stringBuilder.insert(0, carry % TEN);
            carry /= TEN;
        }
        return stringBuilder.toString();
    }
}
