package com.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertTest {

    @Test
    void shouldInsertTheElementIntoRightPositionOfTheArray() {
        int position = 2;
        int numberOfElements = 50;
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        // position 2 - > index 3   = 50
        var insert = new Insert();
        int[] newArray = insert.set(array, position, numberOfElements);
        System.out.println(Arrays.toString(newArray));
        assertArrayEquals(array, newArray);

    }

}