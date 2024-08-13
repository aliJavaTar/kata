package com.quera;

public class ArithmeticSequence {
    public static int calculateMinimumChanges(int number, int key, int[] sequence) {
        // Find minimum and maximum values in the sequence
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int index = 0; index < number; index++) {
            minVal = Math.min(minVal, sequence[index]);
            maxVal = Math.max(maxVal, sequence[index]);
        }

        // Determine the range for x
        int minX = minVal - (number - 1) * key;
        int maxX = maxVal;

        int minOperations = Integer.MAX_VALUE;

        // Iterate over all possible values of x within the range
        for (int x = minX; x <= maxX; x++) {
            int operations = 0;
            for (int i = 0; i < number; i++) {
                int targetValue = x + i * key;
                operations += Math.abs(sequence[i] - targetValue);
            }
            minOperations = Math.min(minOperations, operations);
        }

        return minOperations;
    }
}
