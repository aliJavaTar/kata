package com.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NetCodeTest {

    @Test
    void topKFrequent() {
        var netCode = new NetCode();
        int k = 1;
        int[] array = {7, 7};

        int[] ints = netCode.topKFrequent(array, k);

        Assertions.assertArrayEquals(new int[]{7}, ints);

        int[] numbers = netCode.topKFrequent(new int[]{1,2,2,3,3,3}, 2);

        Assertions.assertArrayEquals(new int[]{3,2}, numbers);

        Assertions.assertArrayEquals(new int[]{1,2}, netCode.topKFrequent(new int[]{1,2}, 2));
    }
}