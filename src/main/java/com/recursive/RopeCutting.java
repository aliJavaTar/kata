package com.recursive;

public class RopeCutting {



    public int[] cutRodRecursive(int[] prices, int length) {
        return null;
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