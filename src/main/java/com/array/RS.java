package com.array;

public class RS {
    public void reverseString(char[] chars) {
        int start = 0;
        int end = chars.length - 1;
        char temp;
        while (start < end) {
            temp = chars[end];
            chars[end] = chars[start];
            chars[start] = temp;
            start++;
            end--;
        }
    }
}
