package com.array;

public record TwoSum(int[] arrayOfNumbers, int target) {

    public int[] findIndex() {
        boolean isEqual = arrayOfNumbers[0] + arrayOfNumbers[1] == target;
        if (isEqual)
            return new int[]{0, 1};
        for (int index = 0; index < arrayOfNumbers.length; index++) {
            for (int j = index + 1; j < arrayOfNumbers.length; j++) {
                if (arrayOfNumbers[index] + arrayOfNumbers[j] == target)
                    return new int[]{index, j};
            }
        }
        return null;
    }

}
