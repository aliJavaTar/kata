package com.data_structure.bit;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class OneOddOccurring {


    private final int[] numbers;

    public OneOddOccurring(int[] numbers) {
        this.numbers = numbers;
    }


    public int findNumber() {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int number : numbers) {
            if (map.containsKey(number)) {
                count = map.get(number);
                map.put(number, ++count);
                if (count % 2 == 0)
                    return number;
            }
            map.put(number, count);
        }
        return 0;
    }

//    public int findNumber___() {
//        int result = 0;
//        for (int number : numbers) {
//            result ^= number;
//        }
//        return result;
//    }
}
