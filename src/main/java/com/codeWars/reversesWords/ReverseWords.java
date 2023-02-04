package com.codeWars.reversesWords;

public class ReverseWords {
    public String reversWords(String words) {

        char[] reversWord = new char[words.length()];
        int count = 0;

        for (int index = words.length() - 1; index >= 0; index--) {
            reversWord[count] = words.charAt(index);
            count++;
        }
        return String.valueOf(reversWord);

    }
}
