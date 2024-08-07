package com.old.quera;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchSequence {

    public List<Integer> calculate(List<Integer> list, List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            int count = 0;
            for (Integer listItem : list) {
                if (listItem < number) {
                    count++;
                }
            }
            result.add(count);
        }

        return result;
    }

    public List<Integer> calculateFunctional(List<Integer> baseListOfNumbers, List<Integer> comparisonValue) {
        return comparisonValue.stream()
                .map(number -> Math.toIntExact(getCountOfSmaller(baseListOfNumbers, number))).toList();
    }

    private static long getCountOfSmaller(List<Integer> list, Integer number) {
        return list.stream().filter(listItem -> listItem < number).count();
    }

}
