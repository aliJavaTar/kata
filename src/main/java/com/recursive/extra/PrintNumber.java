package com.recursive.extra;

public class PrintNumber {

    public int print(int number) {
        if (number == -1)
            return 0;
        System.out.println(number);
        return print(number - 1);
    }

    public static void main(String[] args) {
        var palindrome = new PrintNumber();
        palindrome.print(8);

    }
}
