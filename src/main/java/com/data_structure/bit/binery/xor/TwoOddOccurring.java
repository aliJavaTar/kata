package com.data_structure.bit.binery.xor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoOddOccurring {

    public static int[] findOddOccurrences(int[] inputArray) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> numbers = new java.util.ArrayList<>(List.of());
        int index = 0;
        for (int num : inputArray) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : inputArray) {
            if (countMap.get(num) % 2 != 0) {
                numbers.add(num);
            }
        }
        numbers.forEach(System.out::println);
        return null;
    }
}
