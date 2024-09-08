package com.math;

public class AddString {
    public String addStrings(String firstNumber, String secondNumber) {
//        int lastIndex = firstNumber.length() - 1;
//        int lastIndexSecond = secondNumber.length() - 1;
//        int carry = 0;
//        StringBuilder builder = new StringBuilder();
//
//        while (lastIndex >= 0 || lastIndexSecond >= 0 || carry == 1) {
//            if (lastIndex >= 0) {
//                carry += firstNumber.charAt(lastIndex--) - '0';
//                lastIndex--;
//            }
//            if (lastIndexSecond >= 0) {
//                carry += secondNumber.charAt(lastIndexSecond--) - '0';
//                lastIndexSecond--;
//            }
//            builder.insert(0, carry % 10);
//            carry /= 10;
//        }
//        return builder.toString();
        int lastIndexOfFirstNumber = firstNumber.length() - 1;
        int lastIndexOfSecondNumber = secondNumber.length() - 1;
        int carry = 0;
        StringBuilder builder = new StringBuilder();
        while (lastIndexOfFirstNumber >= 0 || lastIndexOfSecondNumber >= 0 || carry == 1) {
            if (lastIndexOfFirstNumber >= 0) {
                carry += firstNumber.charAt(lastIndexOfFirstNumber) - '0';
                lastIndexOfFirstNumber--;
            }
            if (lastIndexOfSecondNumber >= 0) {
                carry += secondNumber.charAt(lastIndexOfSecondNumber) - '0';
                lastIndexOfSecondNumber--;
            }
            builder.insert(0, carry % 10);
            carry /= 10;
        }

        return builder.toString();
    }
}