package com.recursive;

public class TextRecursive {
    public String reverse(String text) {
        if (text.length() <= 1)
            return text;
        return reverse(text.substring(1)) + text.charAt(0);
    }
}
