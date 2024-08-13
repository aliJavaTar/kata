package com.quera;

public class ArithmeticSequence {
    public static int calculateMinimumChanges(int number, int key, int[] sequence) {
        int minOperations = Integer.MAX_VALUE;

        // We iterate over possible values for the first element in the sequence
        for (int start = -100; start <= 100; start++) {
            int operations = 0;
            for (int i = 0; i < number; i++) {
                int targetValue = start + i * key;
                operations += Math.abs(sequence[i] - targetValue);
            }
            minOperations = Math.min(minOperations, operations);
        }

        return minOperations;

    }
}
