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

        var resultAfterPar = calculateResult(stackAfterParenthesis);
        var resultBeforePar = calculateResult(stackBeforeParenthesis);
        StringBuilder result = resultAfterPar.append(resultBeforePar);
        return result.reverse().toString();
    }

    private StringBuilder calculateResult(Stack<Character> stack) {
        var result = new StringBuilder();
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
        return result;
    }


}
//"k(a3(b(a2(c))))"  --> ka3ba2c   k  a  3 bababa cc