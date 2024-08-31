package com.codeforces;

import java.util.ArrayList;
import java.util.List;

public class BigInt {
    private final List<Integer> digits;

    public BigInt(List<Integer> digits) {
        this.digits = new ArrayList<>();
        this.digits.add(0);
    }

    public BigInt(long number) {
        this.digits = new ArrayList<>();
        do {
            this.digits.add((int) (number % 10));
            number /= number;
        } while (number > 0);
    }

    public BigInt(String number) {
        this.digits = new ArrayList<>();
        for (int index = number.length() - 1; index >= 0; index--) {
            if (!Character.isDigit(number.charAt(index))) {
                throw new IllegalArgumentException("Invalid character in number");
            }
            this.digits.add(number.charAt(index) - '0');
        }
    }



    public boolean lessThan(BigInt other) {
        int mainLength = this.length(), length = other.length();
        if (mainLength != length) {
            return mainLength < length;
        }
        for (int index = mainLength - 1; index >= 0; index--) {
            if (!this.digits.get(index).equals(other.digits.get(index))) {
                return this.digits.get(index) < other.digits.get(index);
            }
        }
        return false;
    }

    public boolean equals(BigInt other) {
        return this.digits.equals(other.digits);
    }

    public BigInt(BigInt another) {
        this.digits = new ArrayList<>(another.digits);
    }

    public int length() {
        return digits.size();
    }

    public boolean isZero() {
        return digits.size() == 1 && digits.get(0) == 0;
    }
}
