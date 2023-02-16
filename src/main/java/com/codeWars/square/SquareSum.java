package com.codeWars.square;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import static java.lang.Math.*;

public class SquareSum {
    public int sum(int[] numbers) {
        return Arrays.stream(numbers)
                .map(number -> (int) pow(number, 2))
                .sum();
    }
}
