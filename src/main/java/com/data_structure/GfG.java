package com.data_structure;

import java.util.ArrayDeque;
import java.util.Deque;

public class GfG {
    public static boolean isBalanced(String root) {
        Deque<Character> stack = new ArrayDeque<>();
        if (root.length() % 2 != 0) {
            return false;
        }
        for (char character : root.toCharArray()) {
            if (character == '{' || character == '[' || character == '(') {
                stack.push(character);
            } else if (character == '}' || character == ')' || character == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                Character top = stack.peek();
                if (character == ')' && top != '(' || character == '}' && top != '{' || character == ']' && top != '[') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean balanced = isBalanced("()");
        System.out.println(balanced);
    }
}
