package com.quera;

import java.util.ArrayList;
import java.util.List;

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
                .map(number -> Math.toIntExact(baseListOfNumbers.stream()
                        .filter(listItem -> listItem < number).count())).toList();
    }

}
