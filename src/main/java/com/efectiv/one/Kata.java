package com.efectiv.one;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Kata {
    void learn() {
        String badPracticeText = new String("ali");
        String goodPracticeText = "ali";

//        Boolean badPractice = new Boolean(true);
        Boolean goodPractice = Boolean.valueOf("true");


    }

    // TODO Performance can be greatly improved!
    static boolean isRomanNumeral(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }


    // Hideously slow! Can you spot the object creation?
    private static long sum() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    private static long sum_() {
        long sum = 0;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    public void add() {
        Map<String, Long> map = new HashMap<>();
        map.put("A", 1L);
        map.put("B", 2L);
        Set<String> test = map.keySet();
        test.add("C");


    }

    public Map<String, Long> removeKey() {
        Map<String, Long> map = new HashMap<>();
        map.put("A", 1L);
        map.put("B", 2L);
        Set<String> test = map.keySet();
        test.remove("A");
        return map;
    }


}
