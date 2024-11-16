package com.recursive.extra;

public record Palindrome(String text) {

    public boolean isPalindrome() {
        if (text.isEmpty())
            return true;
        return isValid(0, text.length() - 1);
    }

    public boolean isValid(int start, int end) {

        if (text.charAt(start) == text.charAt(end))
            return true;
        if (start == end)
            return false;
        return isValid(start + 1, end - 1);
    }
}
