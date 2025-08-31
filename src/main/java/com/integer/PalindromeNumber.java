package com.integer;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        int original = x;
        int temp = 0;
        while (x != 0) {
            temp += x % 10;
            x /= 10;
            if (x != 0) {
                temp *= 10;
            }
        }

        return temp == original;
    }

}
