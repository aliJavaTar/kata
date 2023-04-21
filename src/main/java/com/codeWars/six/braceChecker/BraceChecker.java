package com.codeWars.six.braceChecker;

import java.util.stream.Stream;

public class BraceChecker {

    public boolean isValid(String braces) {
        if (braces.length() == 1)
            return false;

        return Stream.of(")", "}", "]")
                .noneMatch(s -> s.startsWith(String.valueOf(braces.charAt(0))));

//        braces.chars().mapToObj(value -> (char) value)

    }
}
