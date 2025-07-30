package com.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {
    RotateArray rotateArray;

    @BeforeEach
    void setUp() {
        rotateArray = new RotateArray();
    }

    @Test
    void rotate() {
        int[] nums = {1, 2, 3};
        // {1 , 3 ,2 }
        // {3 , 1 ,2 }
        int[] result = rotateArray.rotate(nums, 1);
        assertArrayEquals(new int[]{3, 1, 2}, result);
    }
}