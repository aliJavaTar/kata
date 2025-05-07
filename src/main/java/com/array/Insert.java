package com.array;

public class Insert {
    public int[] set(int[] array, int position, int numberOfElements) {
        if (array == null || array.length == 0 || position >= array.length) {
            throw new ArrayIndexOutOfBoundsException(position);
        }
        // position 2 - > index 3   = 50
        //        array[0] = 1;       array[0] = 1;
        //        array[1] = 2;       array[1] = 2;
        //        array[2] = 3;       array[2] = 50;
        //        array[3] = 4;       array[3] = 3;
        //                            array[4] = 4;

        for (int i = array.length - 1; i >= position; i--) {
            array[i] = array[i - 1];
        }

        array[position - 1] = numberOfElements;
        return array;
    }
}
