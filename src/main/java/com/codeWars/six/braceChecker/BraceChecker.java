package com.codeWars.six.braceChecker;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

public class BraceChecker {
    private static final Map<Character, Integer> CountOfCharacter = new HashMap<>();

    private static void intiMap() {
        CountOfCharacter.put('(', 0);
        CountOfCharacter.put('[', 0);
        CountOfCharacter.put('{', 0);
        CountOfCharacter.put(')', 0);
        CountOfCharacter.put(']', 0);
        CountOfCharacter.put('}', 0);
    }

    public boolean isValid(String braces) {
        intiMap();
        CountOfCharacter.keySet().forEach(character -> {
            int count = (int) braces.chars().filter(ch -> ch == character).count();
            CountOfCharacter.put(character, count);
        });


        boolean noneMatch = Stream.of(")", "}", "]")
                .noneMatch(s -> s.startsWith(String.valueOf(braces.charAt(0))));

        if (braces.length() == 1 || !noneMatch)
            return false;


        return Objects.equals(CountOfCharacter.get('('), CountOfCharacter.get(')'))
                && Objects.equals(CountOfCharacter.get('['), CountOfCharacter.get(']'))
                && Objects.equals(CountOfCharacter.get('{'), CountOfCharacter.get('}'));
/*

           [ ( ] )

            [  ]

            ( [ ) ]
 */

    }
}

