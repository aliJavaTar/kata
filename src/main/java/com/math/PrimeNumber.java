package com.math;

import java.util.stream.IntStream;

public record PrimeNumber() {

    public  boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(i -> number % i == 0);
    }
}
