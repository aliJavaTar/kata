package com.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MonotonicArrayTest {
    private MonotonicArray monotonicArray;

    @BeforeEach
    void setUp() {
        monotonicArray = new MonotonicArray();
    }

    @Test
    void should_return_true_if_array_monotone_increasing() {

        boolean isIncreasing1 = monotonicArray.isMonotonic(new int[]{100, 101, 102});
        Assertions.assertThat(isIncreasing1).isTrue();

        boolean isIncreasing2 = monotonicArray.isMonotonic(new int[]{1, 2, 3});
        Assertions.assertThat(isIncreasing2).isTrue();

        boolean isIncreasing3 = monotonicArray.isMonotonic(new int[]{5, 6, 7});
        Assertions.assertThat(isIncreasing3).isTrue();


        boolean isIncreasing4 = monotonicArray.isMonotonic(new int[]{100, 101, 101});
        Assertions.assertThat(isIncreasing4).isTrue();

        boolean isIncreasing5 = monotonicArray.isMonotonic(new int[]{1, 2, 2});
        Assertions.assertThat(isIncreasing5).isTrue();

        boolean isIncreasing6 = monotonicArray.isMonotonic(new int[]{5, 6, 6});
        Assertions.assertThat(isIncreasing6).isTrue();

    }

    @Test
    void should_return_true_if_array_monotone_increasing() {

        boolean isIncreasing1 = monotonicArray.isMonotonic(new int[]{100, 101, 102});
        Assertions.assertThat(isIncreasing1).isTrue();

        boolean isIncreasing2 = monotonicArray.isMonotonic(new int[]{1, 2, 3});
        Assertions.assertThat(isIncreasing2).isTrue();

        boolean isIncreasing3 = monotonicArray.isMonotonic(new int[]{5, 6, 7});
        Assertions.assertThat(isIncreasing3).isTrue();


        boolean isIncreasing4 = monotonicArray.isMonotonic(new int[]{100, 101, 101});
        Assertions.assertThat(isIncreasing4).isTrue();

        boolean isIncreasing5 = monotonicArray.isMonotonic(new int[]{1, 2, 2});
        Assertions.assertThat(isIncreasing5).isTrue();

        boolean isIncreasing6 = monotonicArray.isMonotonic(new int[]{5, 6, 6});
        Assertions.assertThat(isIncreasing6).isTrue();

    }

}