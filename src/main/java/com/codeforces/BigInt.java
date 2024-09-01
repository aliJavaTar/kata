package com.codeforces;

import java.util.ArrayList;
import java.util.List;

public class BigInt {
    private static final int BASE = 10;
    private static final int INITIAL_CAPACITY = 1;

    private final List<Integer> digits;
    private boolean isNegative;

    // Constructor for positive and negative long values
    public BigInt(long number) {
        this.digits = new ArrayList<>(INITIAL_CAPACITY);
        this.isNegative = number < 0;
        number = Math.abs(number);

        if (number == 0) {
            digits.add(0);
        } else {
            while (number > 0) {
                digits.add((int) (number % BASE));
                number /= BASE;
            }
        }
        normalize();
    }

    public BigInt(String number) {
        if (number == null || number.isEmpty()) {
            throw new IllegalArgumentException("Invalid number format");
        }

        this.digits = new ArrayList<>();
        if (number.charAt(0) == '-') {
            this.isNegative = true;
            number = number.substring(1);
        }

        for (int i = number.length() - 1; i >= 0; i--) {
            if (!Character.isDigit(number.charAt(i))) {
                throw new IllegalArgumentException("Invalid character in number");
            }
            this.digits.add(number.charAt(i) - '0');
        }
        normalize();
    }

    public BigInt(int number) {
        this(String.valueOf(number));
    }

    // Private default constructor for internal use
    private BigInt() {
        this.digits = new ArrayList<>(INITIAL_CAPACITY);
    }

    public BigInt add(BigInt other) {
        if (this.isNegative == other.isNegative) {
            BigInt result = new BigInt();
            result.digits.addAll(addAbsolute(other).digits);
            result.isNegative = this.isNegative;
            result.normalize();
            return result;
        } else {
            if (compareAbsolute(other) >= 0) {
                BigInt result = new BigInt();
                result.digits.addAll(subtractAbsolute(other).digits);
                result.isNegative = this.isNegative;
                result.normalize();
                return result;
            } else {
                BigInt result = new BigInt();
                result.digits.addAll(other.subtractAbsolute(this).digits);
                result.isNegative = other.isNegative;
                result.normalize();
                return result;
            }
        }
    }

    public BigInt subtract(BigInt other) {
        if (this.isNegative != other.isNegative) {
            BigInt result = new BigInt();
            result.digits.addAll(addAbsolute(other).digits);
            result.isNegative = this.isNegative;
            result.normalize();
            return result;
        } else {
            if (compareAbsolute(other) >= 0) {
                BigInt result = new BigInt();
                result.digits.addAll(subtractAbsolute(other).digits);
                result.isNegative = this.isNegative;
                result.normalize();
                return result;
            } else {
                BigInt result = new BigInt();
                result.digits.addAll(other.subtractAbsolute(this).digits);
                result.isNegative = !this.isNegative;
                result.normalize();
                return result;
            }
        }
    }

    public BigInt increment() {
        if (isNegative) {
            if (isZero()) {
                return new BigInt(1); // Edge case: Incrementing zero should result in one.
            } else {
                BigInt positive = new BigInt(this.toString().substring(1));
                BigInt decremented = positive.decrement();
                decremented.isNegative = true; // Maintain negative sign
                if (decremented.isZero()) {
                    return new BigInt(0); // If decrementing from zero, the result should be zero.
                }
                return decremented;
            }
        } else {
            BigInt result = add(new BigInt(1));
            if (result.isZero()) {
                return new BigInt(0); // Correct zero representation
            }
            return result;
        }
    }

    public BigInt decrement() {
        if (isNegative) {
            BigInt positive = new BigInt(this.toString().substring(1));
            BigInt incremented = positive.increment();
            incremented.isNegative = true; // Maintain negative sign
            return incremented;
        } else {
            BigInt result = subtract(new BigInt(1));
            if (result.isZero()) {
                return new BigInt(0); // Correct zero representation
            }
            return result;
        }
    }

    public boolean lessThan(BigInt other) {
        if (this.isNegative != other.isNegative) {
            return this.isNegative;
        }
        if (this.isNegative) {
            return compareAbsolute(other) > 0;
        } else {
            return compareAbsolute(other) < 0;
        }
    }


    public boolean isZero() {
        return digits.size() == 1 && digits.get(0) == 0;
    }

    private BigInt addAbsolute(BigInt other) {
        BigInt result = new BigInt();
        int maxLength = Math.max(this.digits.size(), other.digits.size());
        int carry = 0;

        for (int i = 0; i < maxLength; i++) {
            int sum = carry;
            if (i < this.digits.size()) sum += this.digits.get(i);
            if (i < other.digits.size()) sum += other.digits.get(i);
            result.digits.add(sum % BASE);
            carry = sum / BASE;
        }
        if (carry > 0) result.digits.add(carry);
        result.normalize();
        return result;
    }

    private BigInt subtractAbsolute(BigInt other) {
        BigInt result = new BigInt();
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
        result.normalize();
        return result;
    }

    private int compareAbsolute(BigInt other) {
        if (this.digits.size() != other.digits.size()) {
            return Integer.compare(this.digits.size(), other.digits.size());
        }
        for (int i = this.digits.size() - 1; i >= 0; i--) {
            if (!this.digits.get(i).equals(other.digits.get(i))) {
                return Integer.compare(this.digits.get(i), other.digits.get(i));
            }
        }
        return 0;
    }

    private void normalize() {
        while (digits.size() > 1 && digits.get(digits.size() - 1) == 0) {
            digits.remove(digits.size() - 1);
        }
        if (isZero()) {
            isNegative = false;
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (isNegative) sb.append('-');
        for (int i = digits.size() - 1; i >= 0; i--) {
            sb.append(digits.get(i));
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BigInt other = (BigInt) obj;
        return isNegative == other.isNegative && digits.equals(other.digits);
    }

    @Override
    public int hashCode() {
        return 31 * (isNegative ? 1 : 0) + digits.hashCode();
    }

}
