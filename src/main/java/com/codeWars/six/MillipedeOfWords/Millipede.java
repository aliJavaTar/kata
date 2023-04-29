package com.codeWars.six.MillipedeOfWords;

import java.util.Arrays;

public class Millipede {
    public boolean checkWords(String[] millipede) {



        return true;
    }

    private static void convertLastChartToUpperCase(String[] millipede) {
        for (int index = 0; index < millipede.length; index++) {
            String lastChar = String.valueOf(millipede[index].charAt(millipede[index].length() - 1));
            millipede[index] = millipede[index].replace(lastChar, lastChar.toUpperCase());
        }
    }

    private static void convertFirstChartToUpperCase(String[] millipede) {
        for (int index = 0; index < millipede.length; index++) {
            String firstChar = String.valueOf(millipede[index].charAt(0));
            millipede[index] = millipede[index].replace(firstChar, firstChar.toUpperCase());
        }
    }
}