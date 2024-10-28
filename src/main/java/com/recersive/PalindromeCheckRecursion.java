package com.recersive;

public class PalindromeCheckRecursion {

    public boolean isValid(String input) {

        char[] charArray = input.toCharArray();
        int j = charArray.length - 1;
        for (int index = 0; index < charArray.length; index++) {
            if (j == index)
                break;
            if (charArray[index] != charArray[j])
                return false;
            j--;
        }
        return true;
    }
}
