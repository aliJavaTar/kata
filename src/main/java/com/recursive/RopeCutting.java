package com.recursive;

public class RopeCutting {

    public int countOfPossible(int lengthOfRope, int a, int b, int c) {

        if (lengthOfRope <= 0)
            return -1;

        int res = Math.max(countOfPossible(lengthOfRope - a, a, b, c),
                Math.max(countOfPossible(lengthOfRope - b, a, b, c),
                        countOfPossible(lengthOfRope - c, a, b, c)));

        return res + 1;

    }

}
