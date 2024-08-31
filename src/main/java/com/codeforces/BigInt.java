package com.codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigInt {
    private static final int BASE = 10;
    private static final int CARRY_INCREMENT = 1;
    private final List<Integer> digits;

    public BigInt(List<Integer> digits) {
        this.digits = new ArrayList<>(digits);
        removeLeadingZeros();
    }

    public BigInt(long number) {
        this.digits = new ArrayList<>();
        do {
            this.digits.add((int) (number % BASE));
            number /= BASE;
        } while (number > 0);
        removeLeadingZeros();
    }

    public BigInt(String number) {
        this.digits = new ArrayList<>();
        for (int index = number.length() - 1; index >= 0; index--) {
            char c = number.charAt(index);
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Invalid character in number");
            }
            this.digits.add(c - '0');
        }
        removeLeadingZeros();
    }

    // Copy constructor
    private BigInt(BigInt another) {
        this.digits = new ArrayList<>(another.digits);
        removeLeadingZeros();
    }

    private void removeLeadingZeros() {
        while (digits.size() > 1 && digits.get(digits.size() - 1) == 0) {
            digits.remove(digits.size() - 1);
        }
    }

    public BigInt add(BigInt other) {
        BigInt result = new BigInt(0);
        int maxLength = Math.max(this.length(), other.length());
        int carry = 0;

        for (int index = 0; index < maxLength; index++) {
            int sum = carry;
            if (index < this.length()) sum += this.digits.get(index);
            if (index < other.length()) sum += other.digits.get(index);
            result.digits.add(sum % BASE);
            carry = sum / BASE;
        }

        if (carry > 0) result.digits.add(carry);
        return result;
    }

    public BigInt increment() {
        int carry = CARRY_INCREMENT;
        for (int index = 0; index < digits.size(); index++) {
            int newValue = digits.get(index) + carry;
            digits.set(index, newValue % BASE);
            carry = newValue / BASE;
            if (carry == 0) break;
        }
        if (carry > 0) digits.add(carry);
        return this;
    }

    public BigInt decrement() {
        if (isZero()) throw new ArithmeticException("Underflow");
        int index = 0;
        while (index < digits.size() && digits.get(index) == 0) {
            digits.set(index, BASE - 1);
            index++;
        }
        digits.set(index, digits.get(index) - 1);
        removeLeadingZeros();
        return this;
    }

    public boolean lessThan(BigInt other) {
        if (this.length() != other.length()) {
            return this.length() < other.length();
        }
        for (int index = this.length() - 1; index >= 0; index--) {
            if (!this.digits.get(index).equals(other.digits.get(index))) {
                return this.digits.get(index) < other.digits.get(index);
            }
        }
        return false;
    }

    public boolean equals(BigInt other) {
        return this.digits.equals(other.digits);
    }

    public int length() {
        return digits.size();
    }

    private boolean isOdd() {
        return !this.isZero() && this.digits.get(0) % 2 != 0;
    }

    public boolean isZero() {
        return digits.size() == 1 && digits.get(0) == 0;
    }

    public BigInt divide(BigInt divisor) {
        if (divisor.isZero()) {
            throw new ArithmeticException("Division by zero");
        }

        BigInt quotient = new BigInt(0);
        BigInt currentValue = new BigInt(0);

        for (int i = digits.size() - 1; i >= 0; i--) {
            currentValue = currentValue.multiply(new BigInt(BASE))
                    .add(new BigInt(digits.get(i)));

            int quotientDigit = 0;
            while (currentValue.compareTo(divisor) >= 0) {
                currentValue = currentValue.subtract(divisor);
                quotientDigit++;
            }

            if (quotientDigit > 0 || !quotient.isZero()) {
                quotient = quotient.multiply(new BigInt(BASE)).add(new BigInt(quotientDigit));
            }
        }

        quotient.removeLeadingZeros();
        return quotient;
    }

    private BigInt multiply(BigInt other) {
        int thisSize = this.digits.size();
        int otherSize = other.digits.size();

        // Base case for recursion
        if (thisSize == 0 || otherSize == 0) return new BigInt(0);
        if (thisSize == 1 || otherSize == 1) {
            return new BigInt(this.digits.get(0) * other.digits.get(0));
        }

        int halfSize = Math.max(thisSize, otherSize) / 2;

        BigInt high1 = getHighPart(halfSize);
        BigInt low1 = getLowPart(halfSize);
        BigInt high2 = other.getHighPart(halfSize);
        BigInt low2 = other.getLowPart(halfSize);

        BigInt z0 = low1.multiply(low2);
        BigInt z1 = (low1.add(high1)).multiply(low2.add(high2));
        BigInt z2 = high1.multiply(high2);

        return z2.shiftLeft(2 * halfSize).add(z1.subtract(z2).subtract(z0).shiftLeft(halfSize)).add(z0);
    }

    private BigInt getHighPart(int halfSize) {
        List<Integer> highPartDigits = new ArrayList<>();
        for (int i = halfSize; i < digits.size(); i++) {
            highPartDigits.add(digits.get(i));
        }
        return new BigInt(highPartDigits);
    }

    private BigInt getLowPart(int halfSize) {
        List<Integer> lowPartDigits = new ArrayList<>();
        for (int i = 0; i < Math.min(halfSize, digits.size()); i++) {
            lowPartDigits.add(digits.get(i));
        }
        return new BigInt(lowPartDigits);
    }

    private BigInt shiftLeft(int positions) {
        List<Integer> shiftedDigits = new ArrayList<>(Collections.nCopies(positions, 0));
        shiftedDigits.addAll(this.digits);
        return new BigInt(shiftedDigits);
    }


    private BigInt subtract(BigInt other) {
        if (this.compareTo(other) < 0) throw new ArithmeticException("Subtraction results in negative value");

        BigInt result = new BigInt(0);
        int borrow = 0;
        for (int i = 0; i < this.digits.size(); i++) {
            int diff = this.digits.get(i) - (i < other.digits.size() ? other.digits.get(i) : 0) - borrow;
            if (diff < 0) {
                diff += BASE;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.digits.add(diff);
        }
        result.removeLeadingZeros();
        return result;
    }

    private int compareTo(BigInt other) {
        if (this.digits.size() != other.digits.size()) {
            return this.digits.size() - other.digits.size();
        }
        for (int i = this.digits.size() - 1; i >= 0; i--) {
            if (!this.digits.get(i).equals(other.digits.get(i))) {
                return this.digits.get(i) - other.digits.get(i);
            }
        }
        return 0;
    }

    public BigInt pow(BigInt exponent) {
        if (exponent.isZero()) {
            return new BigInt(1); // Any number to the power of 0 is 1
        }
        if (exponent.equals(new BigInt(1))) {
            return this; // Any number to the power of 1 is itself
        }

        BigInt base = this;
        BigInt result = new BigInt(1);
        BigInt currentExponent = exponent;

        while (!currentExponent.isZero()) {
            if (currentExponent.isOdd()) {
                result = result.multiply(base);
            }
            base = base.multiply(base);
            currentExponent = currentExponent.divide(new BigInt(2));
        }

        return result;
    }


    @Override
    public String toString() {
        if (isZero()) return "0";
        StringBuilder sb = new StringBuilder();
        for (int i = digits.size() - 1; i >= 0; i--) {
            sb.append(digits.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BigInt base = new BigInt("2");
        BigInt exponent = new BigInt("3");
        BigInt result = base.pow(exponent);
        System.out.println(result); // Output should be 8 (2^3)
    }
}

//    class exp_sq {
//        static long N = 1000000007L; // prime modulo value
//        public static void main(String[] args)
//        {
//            long base = 5;
//            long exp = 100000;
//
//            long modulo = exponentiation(base, exp);
//            System.out.println(modulo);
//        }
//
//        static long exponentiation(long base, long exp)
//        {
//            if (exp == 0)
//                return 1;
//
//            if (exp == 1)
//                return base % N;
//
//            long t = exponentiation(base, exp / 2);
//            t = (t * t) % N;
//
//            // if exponent is even value
//            if (exp % 2 == 0)
//                return t;
//
//                // if exponent is odd value
//            else
//                return ((base % N) * t) % N;
//        }
//    }
//}
