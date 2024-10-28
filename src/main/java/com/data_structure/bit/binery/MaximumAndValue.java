package com.data_structure.bit.binery;

import java.util.Arrays;

public record MaximumAndValue(int[] array) {
    public int find() {
        if (array.length < 2)
            return 0;
        Arrays.sort(array);
        int maxAndValue = 0;

        for (int i = array.length - 1; i >= 1; i--) {
            int andValue = array[i] & array[i - 1];
            maxAndValue = Math.max(maxAndValue, andValue);
        }

        return maxAndValue;
    }
}
