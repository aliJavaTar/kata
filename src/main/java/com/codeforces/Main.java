package com.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int n = scanner.nextInt();
        long k = scanner.nextLong(); // k can be very large, so use long
        long[] a = new long[n];
        long[] b = new long[n];

        // Read the elements of the sequence
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        // Construct the b array
        for (int i = 0; i < n; i++) {
            b[i] = a[i] - (long) i * k; // Calculate b[i]
        }

        // Sort the b array to find the median
        Arrays.sort(b);

        // Find the median of b
        long M;
        if (n % 2 == 1) {
            M = b[n / 2];
        } else {
            M = b[(n / 2) - 1]; // For an even firstNumber of elements, we take the lower middle
        }

        // Calculate the minimum firstNumber of operations
        long minOperations = 0;
        for (int i = 0; i < n; i++) {
            minOperations += Math.abs(b[i] - M); // Sum of absolute differences
        }

        // Print the result
        System.out.println(minOperations);

        scanner.close();
    }

}
