package com.codeforces;

import java.util.Map;
import java.util.Stack;

import static java.lang.Integer.*;
import static java.lang.String.*;

public class StringExpansion {
    private final String letters;

    public StringExpansion(String letters) {
        this.letters = letters;
    }

    public String expandedLetter() {
        if (letters.length() == 1)
            return letters;
        StringBuilder result = new StringBuilder();
        int multiplier = 0;
        Stack<Character> stack = new Stack<>();
        for (int index = letters.length() - 1; index >= 0; index--) {
            if (letters.charAt(index) != ')' && letters.charAt(index) != '(') {
                stack.push(letters.charAt(index));
            }
        }

        Character pop = stack.pop();
        if (!isCharacter(pop))
            multiplier = parseInt(pop.toString());
        while (stack.iterator().hasNext()) {
            Character character = stack.pop();
            if (isCharacter(character)) {
                result.append(character);
            }
        }
        for (int index = 0; index < multiplier-1; index++) {
            result.append(result);
        }
        return result.toString();
    }

    private static boolean isCharacter(Character character) {
        return character >= 'a' && character <= 'z';
    }

}
