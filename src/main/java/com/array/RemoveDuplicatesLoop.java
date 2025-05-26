package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesLoop {
    /**
     * Builds a fresh ArrayList of unique values, then copies back.
     * Time: O(n), Space: O(n)
     */
    public static int removeDuplicatesWithExtraList(int[] nums) {
        if (nums.length == 0) return 0;

        List<Integer> unique = new ArrayList<>();
        unique.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != unique.get(unique.size() - 1)) {
                unique.add(nums[i]);
            }
        }

        for (int i = 0; i < unique.size(); i++) {
            nums[i] = unique.get(i);
        }
        return unique.size();
    }

    public static int removeDuplicatesTwoPointers(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int writeIndex = 0;

        for (int readIndex = 1; readIndex < n; readIndex++) {
            if (nums[readIndex] != nums[writeIndex]) {
                writeIndex++;
                nums[writeIndex] = nums[readIndex];
            }
        }

        return writeIndex + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize = removeDuplicatesTwoPointers(arr);
        int[] a = Arrays.copyOf(arr, newSize);
        System.out.println(Arrays.toString(a));
    }
}
