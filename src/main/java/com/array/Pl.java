package com.array;

public class Pl {
    public boolean isPalindrome(String s) {
        // )P
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.toLowerCase().charAt(start) != s.toLowerCase().charAt(end) &&
                    Character.isLetterOrDigit(s.charAt(start)) && Character.isLetterOrDigit(s.charAt(end)))
            {
                return false;
            }

            if (Character.isLetterOrDigit(s.charAt(start)) && Character.isLetterOrDigit(s.charAt(end))) {
                start++;
                end--;
            } else if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }


        }
        return true;
    }

}
