package com.quera;

public class ArithmeticSequence {
    public static int calculateMinimumChanges(int n, int k, int[] sequence) {
        // Find minimum and maximum values in the sequence
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            minVal = Math.min(minVal, sequence[i]);
            maxVal = Math.max(maxVal, sequence[i]);
        }

        // Determine the range for x
        int minX = minVal - (n - 1) * k;
        int maxX = maxVal;

        int minOperations = Integer.MAX_VALUE;

        // Iterate over all possible values of x within the range
        for (int x = minX; x <= maxX; x++) {
            int operations = 0;
            for (int i = 0; i < n; i++) {
                int targetValue = x + i * k;
                operations += Math.abs(sequence[i] - targetValue);
            }
            minOperations = Math.min(minOperations, operations);
        }

        return minOperations;
    }
}
