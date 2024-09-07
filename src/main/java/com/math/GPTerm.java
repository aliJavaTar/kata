package com.math;

public class GPTerm {
    public int GpTerm(int a, int b, int n) {
        {
            if (n == 1)
                return a;
            int result = a;

            for (int index = a; index <= n; index += b) {
                result *= index;
            }
            return result;
        }
    }
}
