package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TowSumTest {

    @Test
    void should_give_tow_number_of_array_that_sum_of_them_equal_target() {
        TowSum sum = new TowSum();

        assertThat(sum.sum(new int[]{3, 3}, 6)).isEqualTo(new int[]{0, 1});

        assertThat(sum.sum(new int[]{3, 2, 4}, 6)).isEqualTo(new int[]{1, 2});

        assertThat(sum.sum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{0, 1});

//        assertThat(sum.sum(new int[]{2, 3, 4}, 6)).isEqualTo(new int[]{0, 2});
    }
}