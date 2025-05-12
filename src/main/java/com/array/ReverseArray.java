package com.array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        reverseArray(new int[]{1, 2, 3, 4, 5});
    }

    private static void reverseArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int start = 0;
        int last = arr.length - 1;

        while (start < last) {
         int temp = arr[start];
         arr[start] = arr[last];
         arr[last] = temp;
         start++;
         last--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
