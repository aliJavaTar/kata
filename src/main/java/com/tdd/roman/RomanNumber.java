package com.tdd.roman;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumber {

    int arabicNumber;
    Map<Integer, String> romanMap;

    public RomanNumber(int arabicNumber) {
    this.arabicNumber = arabicNumber;
    romanMap = new LinkedHashMap<>();
    romanMap.put(10, "X");
    romanMap.put(5, "V");
    }

    public String convert() {
        StringBuilder result = new StringBuilder();

        int i = 10;
        while (arabicNumber >= i){
            result.append(romanMap.get(i));
            arabicNumber -= i;
        }
        int i1 = 5;
        while (arabicNumber >= i1){
            result.append(romanMap.get(i1));
            arabicNumber -= i1;
        }
            for (int index = 0; index < arabicNumber; index++) {
                result.append("I");
        }
        return result.toString();
    }
}
