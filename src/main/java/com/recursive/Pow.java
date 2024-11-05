package com.recursive;

import java.util.HashMap;
import java.util.Map;

public class Pow {
    private final Map<Integer, Integer> map = new HashMap<>();


    public String reverse(String text) {

        if (text.length() <= 1)
            return text;
        return reverse(text.substring(1)) + text.charAt(0);
    }

    public static int pow(int number, int power) {
        int result = 1;
        for (int index = 0; index < power; index++) {
            result *= number;
        }
        return result;
    }

    public static int pow_(int number, int power) {
        if (power == 1)
            return number;
        return  number * pow_(number, power - 1);

    }

    public static boolean isPal(String text) {

        return isValid(0, text.length() - 1, text);
    }

    public static boolean isValid(int start, int end, String text) {
        if (start >= end)
            return false;
        if (text.charAt(start) == text.charAt(end))
            return true;

        return isValid(start + 1, end - 1, text);
    }

    public static void main(String[] args) {
        System.out.println(pow_(3, 2));
    }
}
