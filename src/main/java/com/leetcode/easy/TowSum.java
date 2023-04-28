package com.leetcode.easy;

public class TowSum {
    public int[] sum(int[] numbers, int target)
    {

        for (int index = 0; index < numbers.length; index++)
        {
            for (int i = 1; i < numbers.length; i++)
            {

                if (numbers[index] + numbers[i] == target)
                    return new int[]{index, i};
            }
        }
        return numbers;
    }
}
