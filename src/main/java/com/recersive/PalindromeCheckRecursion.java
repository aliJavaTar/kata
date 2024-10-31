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

    public boolean isPalindrome(String input) {
        if (input.isEmpty())
            return true;


        return isValidRecursive(input, 0, input.length() - 1);
    }

    private boolean isValidRecursive(String input, int startingIndex, int endIndex) {

        if (startingIndex >= endIndex)
            return true;

        if (input.charAt(startingIndex) != input.charAt(endIndex))
            return false;

        return isValidRecursive(input, startingIndex + 1, endIndex - 1);

    }

}
