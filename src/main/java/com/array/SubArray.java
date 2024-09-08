package com.array;

public record SubArray(int[] array) {

    public int findMaximumSubarraySum() {
        if (array.length == 0) {
            return 0;
        }
        int maximum = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length - 1; j++) {
                if (array[i] + array[j] > maximum) {
                    maximum = array[i] + array[j];
                }
            }
        }
        return maximum;
    }
}
