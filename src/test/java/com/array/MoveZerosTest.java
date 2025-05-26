package com.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {

    @Test
    void moveZero() {
        int[] arr = {0, 1, 9, 8, 4, 2, 7, 6, 9};
        var moveZeroes = new MoveZeros();
        int[] ints = moveZeroes.moveZeroes(arr);
        assertArrayEquals(new int[]{1, 9, 8, 4, 2, 7, 6, 9, 0}, ints);
    }
}