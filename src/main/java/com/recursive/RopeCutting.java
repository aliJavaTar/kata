package com.recursive;

public class RopeCutting {

    public static int countOfPossible(int n, int a, int b, int c) {

        if (n == 0)
            return -1;
        if(n <= -1)
            return -1;
        int res = Math.max(countOfPossible(n - a, a, b, c),
                Math.max(countOfPossible(n - b, a, b, c),
                        countOfPossible(n - c, a, b, c)));
        if(res == -1)
            return -1;
        return res + 1;

    }
    public static void main(String [] args)
    {
        int n = 17, a = 10, b = 11, c = 3;

        System.out.println(countOfPossible(n, a, b, c));

    }


    public int cutRodRecursive(int[] prices, int length) {
        if (length <= 0) {
            return 0;
        }

        int maxRevenue = Integer.MIN_VALUE;
        for (int i = 1; i <= length; i++) {
            int revenue = prices[i] + cutRodRecursive(prices, length - i);
            maxRevenue = Math.max(maxRevenue, revenue);
        }

        return maxRevenue;
    }
}
