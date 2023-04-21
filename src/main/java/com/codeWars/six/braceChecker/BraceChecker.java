package com.codeWars.six.braceChecker;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

public class BraceChecker {
    private  final Map<Character, Integer> countOfCharacter = new HashMap<>();

    private void intiMap() {
        countOfCharacter.put('(', 0);
        countOfCharacter.put('[', 0);
        countOfCharacter.put('{', 0);
        countOfCharacter.put(')', 0);
        countOfCharacter.put(']', 0);
        countOfCharacter.put('}', 0);
    }

    public boolean isValid(String braces) {

        intiMap();
        countOfCharacter.keySet().forEach(character -> {
            int count = (int) braces.chars().filter(ch -> ch == character).count();
            countOfCharacter.put(character, count);
        });


        boolean noneMatch = Stream.of(")", "}", "]")
                .noneMatch(s -> s.startsWith(String.valueOf(braces.charAt(0))));

        if (braces.length() == 1 || !noneMatch)
            return false;


        for (int index = 0; index < braces.length() - 1; index++) {

            if ((braces.charAt(index) == '(' && (braces.charAt(index + 1) == ']' || braces.charAt(index + 1) == '}'))
                    || (braces.charAt(index) == '[' && (braces.charAt(index + 1) == ')' || braces.charAt(index + 1) == '}'))
                    || (braces.charAt(index) == '{' && (braces.charAt(index + 1) == ')' || braces.charAt(index + 1) == ']')))
                return false;


        }



        return Objects.equals(countOfCharacter.get('('), countOfCharacter.get(')'))
                && Objects.equals(countOfCharacter.get('['), countOfCharacter.get(']'))
                && Objects.equals(countOfCharacter.get('{'), countOfCharacter.get('}'));


    }
}

/*
Testing "())({}}{()][]["
Incorrect answer for "())({}}{()][][" ==> expected: <false> but was: <true>
 */

