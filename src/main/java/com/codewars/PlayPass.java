package com.codewars;

public class PlayPass {
    private static final char FIRST_UPPER_ALPHABET = 'A';
    private static final char FIRST_LOWER_ALPHABET = 'a';
    private static final int COUNT_OF_ENGLISH_ALPHABET = 26;

    public static String playPass(String name, int shift) {
        char base;
        char shifted;
        var text = new StringBuilder();

        for (int index = 0; index < name.length(); index++) {
            if (Character.isAlphabetic(name.charAt(index))) {
                base = Character.isUpperCase(name.charAt(index)) ? FIRST_UPPER_ALPHABET : FIRST_LOWER_ALPHABET;
                shifted = (char) ((name.charAt(index) - base + shift) % COUNT_OF_ENGLISH_ALPHABET + base);
                if (index % 2 == 0) {
                    text.append(Character.toUpperCase(shifted));
                } else
                    text.append(Character.toLowerCase(shifted));
            } else if (Character.isDigit(name.charAt(index))) {
                int number = 9 - Integer.parseInt(Character.toString(name.charAt(index)));
                text.append(number);
            } else
                text.append(name.charAt(index));
        }
        return text.reverse().toString();
    }

    public static void main(String[] args) {
        String s = playPass("I LOVE YOU!!!", 1);
        System.out.println(s);
    }
}