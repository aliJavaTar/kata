package com.codeWars.five.SimplePigLatin;

import java.util.Arrays;

public class PigLatin {
    // Pig ----> igPay
    public String pigIt(String text) {
        String[] sentence = text.split(" ");

        for (int index = 0; index < sentence.length; index++) {
            if (sentence[index].length() > 1) {
                String firstCharacter = String.valueOf(sentence[index].charAt(0));
                String textWhiteoutFirstChar = sentence[index].substring(1);
                sentence[index] = textWhiteoutFirstChar.concat(firstCharacter + "ay");
            }
            else if (sentence[index].length() == 1 && !sentence[index].equals("!")
                    && !sentence[index].equals("?") && !sentence[index].equals(":")) {
                sentence[index] = sentence[index].concat("ay");
            }
        }
        return Arrays.stream(sentence).reduce((s, s2) -> s.concat(" ").concat(s2)).orElse("");

    }
}
