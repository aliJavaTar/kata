package com.data_structure.bit;

import java.util.HashMap;
import java.util.Map;

public record OneOddOccurring(int[] numbers) {

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


}
