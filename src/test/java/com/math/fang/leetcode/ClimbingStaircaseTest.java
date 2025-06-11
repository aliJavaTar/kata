package com.math.fang.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClimbingStaircaseTest {

    /*
     Example 1:
     Input: n = 2
     Output: 2
     Explanation: There are two ways to climb to the top.
     1. 1 step + 1 step
     2. 2 steps

     Example 2:
     Input: n = 3
     Output: 3
     Explanation: There are three ways to climb to the top.
     1. 1 step + 1 step + 1 step
     2. 1 step + 2 steps
     3. 2 steps + 1 step

     */
    @Test
    void should_calculate_unique_ways_to_reach_top() {
        var climbingStaircase = new ClimbingStaircase();

        assertThat(climbingStaircase.calculateWays(1)).isEqualTo(1);

        assertThat(climbingStaircase.calculateWays(2)).isEqualTo(2);

        assertThat(climbingStaircase.calculateWays(3)).isEqualTo(3);

        assertThat(climbingStaircase.calculateWays(4)).isEqualTo(5);

        // 1 + 1 + 1 + 1 + 1
        // 2 + 1 + 1 + 1
        // 1 + 2 + 1 + 1
        // 1 + 1 + 2 + 1
        // 1 + 1 + 1 + 2
        // 2 + 2 + 1
        // 1 + 2 + 2
        // 2 + 1 + 2
        assertThat(climbingStaircase.calculateWays(5)).isEqualTo(8);

    }
}