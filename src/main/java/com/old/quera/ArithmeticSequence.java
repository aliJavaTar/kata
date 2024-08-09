package com.old.quera;

import java.util.List;

public class ArithmeticSequence {
    public int calculate(List<Integer> numbers, int key) {
        //1, 3, 5 , 11  -- > key 1
        int result = 0;
        int previousNumber = numbers.get(0);
        for (int index = 0; index < numbers.size() - 1; index++) {
            if (numbers.get(index + 1) - numbers.get(index) != key) {
                result += numbers.get(index + 1) - previousNumber - key;
                previousNumber += 1;
            }
        }

        return previousNumber;
    }
}
