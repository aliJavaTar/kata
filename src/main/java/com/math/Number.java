package com.math;

public record Number(int number) {
    public boolean isPalindromeNumber() {
        int reverse = 0;
        int temp = number;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return this.number == reverse;
    }
}
