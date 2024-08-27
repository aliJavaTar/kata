package com.math;

import java.util.Arrays;

public class Exactly3Divisors {

    public int exactly3Divisors(int value) {
        if (value < 4)
            return 0;

        int limit = (int) Math.sqrt(value);
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int index = 2; index <= limit; index++) {
            if (isPrime[index])
                for (int j = index * index; j <= limit; j += index) {
                    isPrime[j] = false;
                }
        }
        int count = 0;
        for (int index = 0; index <= limit; index++) {
            if (isPrime[index])
                if (index*index <= value)
                {
                    count++;
                }
        }
        return count;
    }

}
