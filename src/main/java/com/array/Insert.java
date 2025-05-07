package com.array;

public class Insert {
    public int[] set(int[] array, int position, int numberOfElements) {
        if (array == null || array.length == 0 || position >= array.length) {
            throw new ArrayIndexOutOfBoundsException(position);
        }
        return array;
    }
}
