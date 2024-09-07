package com.math;

public class GPTerm {
    public int GpTerm(int a, int b, int n) {

        if (n == 1)
            return a;
        double r = (double) b / a;
        double pow = Math.pow(r, n - 1);
        return (int) Math.round(a * pow);
    }
}
