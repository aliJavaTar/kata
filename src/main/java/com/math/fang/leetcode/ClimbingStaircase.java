package com.math.fang.leetcode;

public class ClimbingStaircase {

    public int calculateWays(int number) {
        if (number <= 2) return number;

        int oneStepBefore = 2;
        int twoStepsBefore = 1;
        int allWays = 0;

        for (int i = 3; i <= number; i++) {
            allWays = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = allWays;
        }

        return allWays;
    }

}
