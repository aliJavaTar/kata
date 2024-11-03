package com.recersive;

public record PalindromeCheckRecursion(String input) {


    private static final int STARTING_INDEX = 0;
    private static final int OFFSET = 1;


    public boolean isValid() {
        int left = STARTING_INDEX;
        int right = endingIndex();

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    public boolean isPalindrome() {
        if (input.isEmpty())
            return true;

        return isValidRecursive(STARTING_INDEX, endingIndex());
    }

    private boolean isValidRecursive(final int startingIndex, final int endIndex) {

        if (startingIndex >= endIndex)
            return true;

        if (input.charAt(startingIndex) != input.charAt(endIndex))
            return false;

        return isValidRecursive(startingIndex + OFFSET, endIndex - OFFSET);
    }


    private int endingIndex() {
        return input.length() - 1;
    }

}
