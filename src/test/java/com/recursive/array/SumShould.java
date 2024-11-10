package com.recursive.array;

import org.junit.jupiter.api.Test;


class SumShould {

    @Test
    void calculate() {
        long[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        var result = Sum.calculate_rev(array, 0);
        System.out.println(result);
    }
}