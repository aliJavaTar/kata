package com.integer;

public class Rev {
    public int reverse(int x) {
        boolean negative = x < 0;


        long  result = Math.abs((long) x);

        long temp = 0;
        while (result != 0) {
            temp += result % 10;
            result /= 10;
            if (result != 0) {
                temp *= 10;
            }
        }
        if (negative) {
            return (int) -temp;
        }
        if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) temp;
    }
}


