package com.array;

public class LCP {
    public String longestCommonPrefix(String[] text) {

        if (text == null || text.length == 0) {
            return "";
        }
        String prefix = text[0];

        for (int i = 1; i < text.length; i++) {
            while (text[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}

