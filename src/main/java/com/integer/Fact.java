package com.integer;

public class Fact {
    public int fact(int n) {
        int fact = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            fact += n / i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Fact f = new Fact();
        System.out.printf("this is : %d", f.fact(13));
        System.out.printf("this is : %d", f.fact(30));
    }
}
