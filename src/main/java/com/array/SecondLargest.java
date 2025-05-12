package com.array;

public class SecondLargest {

    private static int getSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num != first && num > second) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("Second largest does not exist");
            return -1;
        }

        return second;
    }


    public static void main(String[] args) {
        int[] arr = {10, 5, 10};
        System.out.println("Second largest: " + getSecondLargest(arr));
    }
}
