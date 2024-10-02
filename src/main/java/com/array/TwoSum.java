package com.array;

import java.util.HashMap;

public record TwoSum(int[] arrayOfNumbers, int target) {

    public int[] findIndex() {

        for (int index = 0; index < arrayOfNumbers.length; index++) {
            for (int j = index + 1; j < arrayOfNumbers.length; j++) {
                if (arrayOfNumbers[index] + arrayOfNumbers[j] == target)
                    return new int[]{index, j};
            }
        }
        return null;
    }

    public int[] findIndex_performance() {

        HashMap<Integer, Integer> complementMap = new HashMap<>();
        for (int index = 0; index < arrayOfNumbers.length; index++) {
            int complement = target - arrayOfNumbers[index];
            if (complementMap.containsKey(complement)) {
                return new int[]{complementMap.get(complement), index};
            }
            complementMap.put(arrayOfNumbers[index], index);
        }

        throw new IllegalStateException("not found");
    }

}
