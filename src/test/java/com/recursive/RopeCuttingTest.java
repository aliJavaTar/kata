package com.recursive;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class RopeCuttingTest {

    @ParameterizedTest
    @MethodSource("provideTestData")
    void testRodCutting(int[] prices, int length, int expectedRevenue) {
        var problem = new RopeCutting();

        int actualRevenue = problem.cutRodRecursive(prices, length);

        assertNotEquals(-1, actualRevenue, "Actual revenue should not be -1");
        assertEquals(expectedRevenue, actualRevenue, "Revenue calculation is incorrect");
        assertTrue(prices.length >= 1 && prices.length <= length, "Prices array should be within bounds");
        assertTrue(length <= 10, "Length should be within reasonable bounds");
        assertEquals(expectedRevenue, actualRevenue);
    }

    private static Object[][] provideTestData() {
        return new Object[][] {
                {new int[]{1, 5, 8, 9}, 4, 10},
                {new int[]{1, 5, 8, 9}, 3, 8},
                {new int[]{1, 5, 8, 9}, 2, 5},
                {new int[]{1, 5, 8, 9}, 1, 1},
                {new int[]{1, 5, 8, 9}, 0, 0},

        };
    }
}