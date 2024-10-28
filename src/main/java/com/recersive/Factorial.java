package com.recersive;

public record Factorial(int number) {

    public int calculate() {
        // n *  n -1  , n * n -2 ................
        int fact = 1;
        for (int index = number; index > 1; index--) {
            fact *= index;
        }
        return fact;
    }

    public int calculate_non_tail_recursive(int number) {
        if (number == 0)
            return 1;
        return number * calculate_non_tail_recursive(number - 1);
    }

    public int calculate_tail_recursive(int number, int saver) {
        if (number == 0)
            return saver;
        return number * calculate_tail_recursive(number - 1, 1);
    }
}
