package com.array;

public class Largest {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 40, 6, 70, 8, 9};
        int index = getLargestElement(array);
        System.out.println(index);
    }

    private static int getLargestElement(int[] array) {
        int max = array[0];
        int index;
        for (index = 1; index < array.length; index++) {
            if (max < array[index]) {
                max = array[index];
            }
        }
        int secondMax = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (max == array[i]) {
                continue;
            }
            if (secondMax < array[i]) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

}
