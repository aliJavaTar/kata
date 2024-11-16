package com.codeforces.math;

import java.util.Arrays;
import java.util.Scanner;

public class LargestCommonDivisor {

    static final int MAX_N = 1000000;
    static final int SQRT_N = 1000;

    static int[] factor = new int[MAX_N + 1];
    static int[] cont = new int[MAX_N + 1];
    static int ans;
    static int[] p = new int[78498];  // The maximum firstNumber of primes below 1,000,000 is around 78,498
    static int[] exp = new int[78498];
    static int n_primes;

    public static void generateDivisors(int n, int div) {
        if (n == n_primes) {
            ++cont[div];
            if (cont[div] == 2 && div > ans) {
                ans = div;
            }
            return;
        }

        for (int i = 0; i <= exp[n]; ++i) {
            generateDivisors(n + 1, div);
            div *= p[n];
        }
    }

    public static void main(String[] args) {
        Arrays.fill(factor, 0);
        factor[1] = 1;

        for (int i = 2; i <= MAX_N; ++i) {
            if (factor[i] == 0) {
                factor[i] = i;
                if (i <= SQRT_N) {
                    for (int j = i * i; j <= MAX_N; j += i) {
                        factor[j] = i;
                    }
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Arrays.fill(cont, 0);
        ans = 1;

        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            n_primes = 0;

            while (x != 1) {
                int f = factor[x];
                p[n_primes] = f;
                exp[n_primes] = 0;

                while (x % f == 0) {
                    x /= f;
                    ++exp[n_primes];
                }

                ++n_primes;
            }

            generateDivisors(0, 1);
        }

        System.out.println(ans);

        sc.close();
    }
}