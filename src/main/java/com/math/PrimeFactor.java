package com.math;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PrimeFactor {
    private final PrimeNumber primeNumber;

    public int calculate(int number) {

        int count = 0;
        for (int index = 2; index < number; index++) {
            boolean isPrimeNumber = primeNumber.isPrime(index);
            if (number % index == 0 && isPrimeNumber) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

}
