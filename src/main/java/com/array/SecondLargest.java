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

    public static int secondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > first) {
                first = num;
            } else if (num != first && num > second) {
                second = num;
            } else if (num != first && num != second && num > third) {
                third = num;
            }
        }
        return third;
    }


    public static void main(String[] args) {
        int[] arr = {12, 5, 10, 7};
        System.out.println("Second largest: " + getSecondLargest(arr));
        System.out.println("Second largest: " + secondLargest(new int[]{12, 5, 10}));
    }

}
