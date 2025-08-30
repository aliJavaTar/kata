package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Contain {
    private int[] numbers;

    public Contain(int[] numbers) {
        this.numbers = numbers;
    }

    public boolean isDuplicated() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isDuplicated_set() {
        Set<Integer> set = Arrays.stream(numbers).boxed()
                .collect(Collectors.toSet());
        return set.size() != numbers.length;
    }

    public boolean isDuplicated_set_l() {
        return Arrays.stream(numbers).distinct().count() != numbers.length;
    }

    public boolean isDuplicated_set1() {
        Set<Integer> set = new HashSet<>();
        for (int number : numbers) {
            if (set.contains(number)) {
                return true;
            }
            set.add(number);
        }
        return false;
    }

    public boolean isDuplicated_sort() {
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public boolean isAnagram(String s, String t) {

        s.charAt(1);
        int[] first = s.chars().sorted().toArray();
        int[] second = t.chars().sorted().toArray();

        return Arrays.equals(first, second);
    }
}
