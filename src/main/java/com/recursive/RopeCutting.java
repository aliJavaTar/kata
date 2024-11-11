package com.recursive;

public class RopeCutting {

    public int cutRodRecursive(int[] prices) {
       return cutRod(prices, prices.length );
    }

    private int cutRod(int[] price, int length) {
        if (length == 0) return 0;

        int maxValue = Integer.MIN_VALUE;

        for (int index = 0; index < length; index++) {
            int currentVal = price[index] + cutRod(price, length - index -1);
            maxValue = Math.max(maxValue, currentVal);
        }

        return maxValue;
    }

}

//    public static int cutRodRecursive(int[] prices, int length) {
//        if (length <= 0)
//            return 0;
//        int maxRevenue = 0;
//        for (int index = 1; index < length; index++) {
//            int revenue = prices[index] + cutRodRecursive(prices, length - index);
//            maxRevenue = Math.max(maxRevenue, revenue);
//        }
//        return maxRevenue;
//    }
//    public static void main(String[] args) {
//        int i = cutRodRecursive(new int[]{1, 5, 8, 9}, 4);
//        System.out.println(i);
//    }