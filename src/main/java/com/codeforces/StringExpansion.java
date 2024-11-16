package com.codeforces;

import java.util.Stack;

import static java.lang.Integer.parseInt;

public class StringExpansion {
    private final String letters;
    private int indexOfFirstParenthesis = -1;

    public StringExpansion(String letters) {
        this.letters = letters;
    }

    public String expandedLetter() {
        StringBuilder resultAfter = new StringBuilder();
        StringBuilder resultBefore = new StringBuilder();

        Stack<Character> stackAfterParenthesis = new Stack<>();
        Stack<Character> stackBeforeParenthesis = new Stack<>();
        for (int index = 0; index < letters.length() - 1; index++) {
            if (letters.charAt(index) == '(' && indexOfFirstParenthesis == -1) {
                indexOfFirstParenthesis = index;
                if (index > 0 && Character.isDigit(letters.charAt(index - 1))) {
                    stackAfterParenthesis.push(letters.charAt(index - 1));
                }
            }
            if (letters.charAt(index) != ')' && letters.charAt(index) != '(' && indexOfFirstParenthesis == -1) {
                stackBeforeParenthesis.push(letters.charAt(index));
            }
            if (letters.charAt(index) != ')' && letters.charAt(index) != '(' && indexOfFirstParenthesis != -1) {
                stackAfterParenthesis.push(letters.charAt(index));
            }
        }
        var string = getString(stackAfterParenthesis, resultAfter);
        var builder = getString(stackBeforeParenthesis, resultBefore);

        return builder.append(string).toString();


    }

    private static StringBuilder getString(Stack<Character> stack, StringBuilder result) {
        int multiplier;
        String temp = "";
        while (stack.iterator().hasNext()) {
            Character character = stack.pop();
            if (Character.isDigit(character)) {
                multiplier = parseInt(character.toString());
                result.append(temp.repeat(Math.max(0, multiplier - 1)));
            } else
                temp = result.append(character).toString();
        }

        return result.reverse();
    }


}
