package com.recursive;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

class RopeCuttingTest {

    @ParameterizedTest
    @MethodSource("provideTestData")
    void rodCutting(int[] prices, int expectedRevenue) {
        var problem = new RopeCutting();
        int result = problem.cutRodRecursive(prices);

        assertThat(result).isEqualTo(expectedRevenue);
    }

    private static Object[][] provideTestData() {
        return new Object[][]{{new int[]{1, 5}, 5},};
    }
}