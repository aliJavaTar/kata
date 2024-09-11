package com.array;

import java.util.Arrays;

public record Find(double[] array) {
    double findTheUniqueNumber() {
        Arrays.sort(array);

        if (array[0] != array[1] && array[0] != array[array.length - 1])
            return array[0];
        return array[array.length - 1];
    }
}
