package com.recersive;

public class PalindromeCheckRecursion {


    public boolean isValid(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
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
