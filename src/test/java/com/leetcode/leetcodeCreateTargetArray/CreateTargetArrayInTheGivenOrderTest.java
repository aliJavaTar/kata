package com.leetcode.leetcodeCreateTargetArray;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateTargetArrayInTheGivenOrderTest {
    private CreateTargetArrayInTheGivenOrder arrayOrder;

    @BeforeEach
    void setUp() {
        arrayOrder = new CreateTargetArrayInTheGivenOrder();
    }

    @Test
    void createTargetArray() {
//        Input: nums = [1] , index = [0]
//        Output: [1]
        int[] nums = new int[1];
        int[] index = new int[1];

        nums[0] = 1;
        index[0] = 0;


        int[] targetArray = arrayOrder.createTargetArray(nums, index);

        int[] expected = new int[1];
//        expected[0]=1;
        Assertions.assertThat(targetArray).isEqualTo(expected);
    }
}