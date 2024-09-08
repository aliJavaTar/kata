package com.math;

public class AddString {
    public String addStrings(String firstNumber, String secondNumber) {
        int lastIndex = firstNumber.length() - 1;
        int lastIndexSecond = secondNumber.length() - 1;
        int carry = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while (lastIndex >= 0 || lastIndexSecond >= 0 || carry == 1) {
            if (lastIndex >= 0) {
                carry += firstNumber.charAt(lastIndex--) - '0';
                lastIndex--;
            }
            if (lastIndexSecond >= 0) {
                carry += secondNumber.charAt(lastIndexSecond--) - '0';
                lastIndexSecond--;
            }
            stringBuilder.insert(0, carry % 10);
            carry /= 10;
        }
        return stringBuilder.toString();
        // Alternative solution using Java 8 streams
        // return Stream.of(firstNumber, secondNumber)
        //        .mapToInt(String::chars)
        //        .map(digit -> digit - '0')
        //        .reduce(0, (a, b) -> (a + b) % 10 + (a + b) / 10);

        // Alternative solution using Java 8 streams and StringBuilder
        // return Stream.of(firstNumber, secondNumber)
        //        .mapToInt(String::chars)
        //        .map(digit -> digit - '0')
        //        .reduce(new StringBuilder(), (builder, digit) -> builder.append((digit + carry) % 10), StringBuilder::append);

    }
}