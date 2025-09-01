package com.integer;

import java.util.HashMap;
import java.util.Map;

public class RTI {


    private static final Map<String, Integer> romanMap = new HashMap<>();

    static {
        romanMap.put("I", 1);
        romanMap.put("IV", 4);
        romanMap.put("V", 5);
        romanMap.put("IX", 9);
        romanMap.put("X", 10);
        romanMap.put("XL", 40);
        romanMap.put("L", 50);
        romanMap.put("XC", 90);
        romanMap.put("C", 100);
        romanMap.put("CD", 400);
        romanMap.put("D", 500);
        romanMap.put("CM", 900);
        romanMap.put("M", 1000);
    }

    public int romanToInt(String s) {
        int count = 0;

        for (int index = 0; index < s.length(); index++) {
            if (index + 1 < s.length()) {
                String two = s.substring(index, index + 2);
                if (romanMap.containsKey(two)) {
                    count += romanMap.get(two);
                    index++;
                    continue;
                }
            }
            count += romanMap.get(String.valueOf(s.charAt(index)));
        }

        return count;
    }
}
