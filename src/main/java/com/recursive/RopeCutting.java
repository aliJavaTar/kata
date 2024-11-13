package com.recursive;

//  cutRod(price, 4)
//  ├── cutRod(price, 3) -> max(1 + cutRod(price, 3), 5 + cutRod(price, 2), 8 + cutRod(price, 1), 9 + cutRod(price, 0))
//  ├── cutRod(price, 2) -> max(1 + cutRod(price, 2), 5 + cutRod(price, 1), 8 + cutRod(price, 0))
//  └── cutRod(price, 1) -> max(1 + cutRod(price, 1), 5 + cutRod(price, 0))
//  └── cutRod(price, 0) -> 0 (base case)


public class RopeCutting {

    public int cutRod(int[] prices) {
        return cutRode(prices, prices.length);
    }

    private int cutRode(int[] prices, int length) {
        if (length == 0) return 0;
        int max = 0;


        for (int index = 0; index < length; index++) {
            int currentValue = prices[index] + cutRode(prices, length - index - 1);
            max = Math.max(currentValue, max);
        }
        return max;
    }

    public int cutRodRecursive(int[] prices) {
        return cutRod(prices, prices.length);
    }

    private int cutRod(int[] price, int length) {
        if (length == 0) return 0;

        int maxValue = Integer.MIN_VALUE;

        for (int index = 0; index < length; index++) {
            int currentVal = price[index] + cutRod(price, length - index - 1);
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