package com.recursive;

//  cutRod(price, 4)
//  ├── cutRod(price, 3) -> max(1 + cutRod(price, 3), 5 + cutRod(price, 2), 8 + cutRod(price, 1), 9 + cutRod(price, 0))
//  ├── cutRod(price, 2) -> max(1 + cutRod(price, 2), 5 + cutRod(price, 1), 8 + cutRod(price, 0))
//  └── cutRod(price, 1) -> max(1 + cutRod(price, 1), 5 + cutRod(price, 0))
//  └── cutRod(price, 0) -> 0 (base case)


public record RopeCutting(int[] prices) {
    private static final int ZERO = 0;
    private static final int ONE_METER = 1;

    public int GetMostPrice() {
        return cutRode(prices, prices.length);
    }

    private int cutRode(int[] prices, int length) {
        if (length == ZERO) return ZERO;
        int totalPrice = ZERO;
        for (int index = ZERO; index < length; index++) {
            int currentPrice = prices[index] + cutRode(prices, length - index - ONE_METER);
            totalPrice = Math.max(currentPrice, totalPrice);
        }
        return totalPrice;
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