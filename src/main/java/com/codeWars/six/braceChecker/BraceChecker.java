package com.codeWars.six.braceChecker;

import java.util.stream.Stream;

public class BraceChecker {

    public boolean isValid(String braces) {
        if (braces.length() == 1)
            return false;

        boolean noneMatch = Stream.of(")", "}", "]")
                .noneMatch(s -> s.startsWith(String.valueOf(braces.charAt(0))));

        if (!noneMatch)
            return false;

        long countOfStartP = getCountOfCharacter(braces, '(');
        long countOfStartA = getCountOfCharacter(braces, '[');
        long countOfStartB = getCountOfCharacter(braces, '{');

        long countOfEndP = getCountOfCharacter(braces, ')');
        long countOfEndA = getCountOfCharacter(braces, ']');
        long countOfEndB = getCountOfCharacter(braces, '}');

        if (countOfStartP != countOfEndP || countOfStartA != countOfEndA || countOfStartB != countOfEndB)
            return false;


        return true;
    }

    private long getCountOfCharacter(String braces, char x) {
        return braces.chars().filter(ch -> ch == x).count();
    }
}
