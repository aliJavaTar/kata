package com.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortedShould {

    @Test
    void if_array_is_sorted_then_return_true() {
        int[] array = {1, 2, 3, 4, 5};
        Sorted sorted = new Sorted();
        boolean isSorted = sorted.isSorted(array);
        Assertions.assertTrue(isSorted);

        int[] array1 = {1, 2, 5};
        var sorted1 = new Sorted();
        boolean isSorted1 = sorted1.isSorted(array1);
        Assertions.assertTrue(isSorted1);
    }

    @Test
    void if_array_is_not_sorted_then_return_false() {
        int[] array = {3, 2, 5};
        Sorted sorted = new Sorted();
        boolean isSorted = sorted.isSorted(array);
        Assertions.assertFalse(isSorted);

        int[] array1 = {1, 2, 2, 1};
        var sorted1 = new Sorted();
        boolean isSorted1 = sorted1.isSorted(array1);
        Assertions.assertFalse(isSorted1);

    }
}