package com.codeforces;

public class New {
        static long N = 1000000007L; // prime modulo value
        public static void main(String[] args)
        {
            long base = 50000000;
            long exp = 1000000000;

            long modulo = exponentiation(base, exp);
            System.out.println(modulo);
        }

        static long exponentiation(long base, long exp)
        {
            if (exp == 0)
                return 1;

            if (exp == 1)
                return base % N;

            long t = exponentiation(base, exp / 2);
            t = (t * t) % N;

            // if exponent is even value
            if (exp % 2 == 0)
                return t;

                // if exponent is odd value
            else
                return ((base % N) * t) % N;
        }
    }
