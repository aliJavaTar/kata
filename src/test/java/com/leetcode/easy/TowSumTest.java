package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TowSumTest {

    @Test
    void should_give_tow_number_of_array_that_sum_of_them_equal_target() {
        TowSum sum = new TowSum();

        int[] result_1 = sum.sum(new int[]{3, 3}, 6);
        assertThat(result_1).isEqualTo(new int[]{0, 1});

        int[] result_2 = sum.sum(new int[]{3, 2, 4}, 6);
        assertThat(result_2).isEqualTo(new int[]{1, 2});

        int[] result_3 = sum.sum(new int[]{2,7,11,15}, 9);
        assertThat(result_3).isEqualTo(new int[]{0, 1});

    }
}