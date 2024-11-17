package com.recursive;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    //    "abc" -->  a b c  ab ac  bc abc
    public void print(String text) {
        calculateSubSet(text, 0, "");
    }

    private void calculateSubSet(String text, int index, String current) {
        if (index == text.length()) {
            System.out.println(current);
            return;
        }
        calculateSubSet(text, index + 1, current + text.charAt(index));
        calculateSubSet(text, index + 1, current);
    }

    public void print_(String text) {
        String[] split = text.split("");

        String[] strings = calculateNumbers(split, split.length);

    }

    private String[] calculateNumbers(String[] split, String[] helper, int count) {
        if (count > split.length)
            throw new IllegalArgumentException("");
        if (count == 0)
            return new String[]{""};

//        return calculateNumbers(, , count - 1);
        List<Integer> integers = new ArrayList<>();
        for (int index = 0; index < split.length; index++) {
            integers.add(index);
        }

    }

}
