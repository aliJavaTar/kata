package com.recursive;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static javax.management.Query.in;
import static org.assertj.core.api.Assertions.assertThat;

class RopeCuttingTest {

    @ParameterizedTest
    @MethodSource("provideTestData")
    void rodCutting(int[] prices, int expectedRevenue) {
        var problem = new RopeCutting(prices);
        int result = problem.GetMostPrice();
        assertThat(result).isEqualTo(expectedRevenue);
    }

    private static Object[][] provideTestData() {
        return new Object[][]{{new int[]{1, 5, 8, 9}, 10},
                {new int[]{3, 5, 8, 9, 10, 17, 17, 20}, 24},
                {new int[] {1, 5, 8, 9, 10, 17, 17, 20}, 22}};
    }
}