package com.recursive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class RopeCuttingTest {

    @ParameterizedTest
    @MethodSource("provideTestData")
    void rodCutting(int[] prices, int length, int[] expectedRevenue) {
        var problem = new RopeCutting();

        int[] result = problem.cutRodRecursive(prices, length);


        Assertions.assertThat(result).isEqualTo(expectedRevenue);
    }

    private static Object[][] provideTestData() {
        return new Object[][]{
                {new int[]{1, 5, 8, 9}, 4, new int[]{2, 2, 10}},
//                {new int[]{1, 5, 8, 9}, 3, 8},
//                {new int[]{1, 5, 8, 9}, 2, 5},
//                {new int[]{1, 5, 8, 9}, 1, 1},
//                {new int[]{1, 5, 8, 9}, 0, 0},

        };
    }
}