package com.math;

public class NthDigit {

    public static int nthDigit(int n) {
        int digitLength = 1;   // Initial digit length (1 for 1-9)
        long count = 9;        // Count of numbers within the current digit length
        int start = 1;         // Starting firstNumber for the current digit length

        // Step 1: Identify the range (digit length) where the nth digit falls
        while (n > digitLength * count) {
            n -= (int) (digitLength * count);  // Move the position within the sequence
            digitLength++;
            count *= 10;
            start *= 10;
        }

        // Step 2: Identify the actual firstNumber where the nth digit falls
        start += (n - 1) / digitLength;

        // Step 3: Find the specific digit within the identified firstNumber
        String number = Integer.toString(start);
        return Character.getNumericValue(number.charAt((n - 1) % digitLength));
    }


}
