package com.array;

public record SubArray(int[] array) {

    public int findMaximumSubarraySum() {
        int maxSum = array[0];

        for (int index = 0; index < array.length; index++) {
            int currentSum = 0;
            for (int j = index + 1; j < array.length; j++) {
                currentSum += array[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    public static int calculateMax(int[] array) {
        int maximumSum = array[0];

        for (int index = 0; index < array.length; index++) {
            int currentSum = 0;
            for (int j = index + 1; j < array.length; j++) {
                currentSum +=  array[j];
                if (currentSum > maximumSum) {
                    maximumSum = currentSum;
                }
            }
        }
        return maximumSum;
    }
}
