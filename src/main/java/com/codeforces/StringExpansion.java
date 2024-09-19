package com.codeforces;

import java.util.Stack;

import static java.lang.Integer.parseInt;

public class StringExpansion {
    private final String letters;

    public StringExpansion(String letters) {
        this.letters = letters;
    }

    public String expandedLetter() {
        StringBuilder result = new StringBuilder();
        int multiplier;
        Stack<Character> stack = new Stack<>();
        for (int index = 0; index < letters.length() - 1; index++) {
            if (letters.charAt(index) != ')' && letters.charAt(index) != '(') {
                stack.push(letters.charAt(index));
            }
        }
        String temp = "";
        while (stack.iterator().hasNext()) {
            Character character = stack.pop();
            if (Character.isDigit(character)) {
                multiplier = parseInt(character.toString());
                result.append(temp.repeat(Math.max(0, multiplier - 1)));
            } else
                temp = result.append(character).toString();
        }

        return result.reverse().toString();
    }


}
//"k(a3(b(a2(c))))"  --> ka3ba2c   k  a  3 bababa cc