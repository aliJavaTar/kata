package com.array;

import java.util.Arrays;

public class Reverse {
    public void reverseString(char[] text) {
        int start = 0;
        int end = text.length - 1;
        while (start < end) {
            char temp = text[start];
            text[start] = text[end];
            text[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(text));
    }
}
