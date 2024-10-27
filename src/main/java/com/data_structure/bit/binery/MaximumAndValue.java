package com.data_structure.bit.binery;

public record MaximumAndValue(int[] array) {
    public int find() {
        int max = 0;
        for (int index = 0; index < array.length - 1; index++) {
            if (index == array.length - 1)
                break;
            max = Math.max(max, index & index + 1);
        }
        return max;
    }
}
