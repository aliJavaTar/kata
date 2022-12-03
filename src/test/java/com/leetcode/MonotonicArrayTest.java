package com.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MonotonicArrayTest {
    private MonotonicArray monotonicArray;

    @BeforeEach
    void setUp() {
        monotonicArray = new MonotonicArray();
    }

    @Test
    void should_return_true_if_array_monotone_increasing() {

        boolean isIncreasing1 = monotonicArray.isMonotonic(new int[]{100, 101, 102});
        assertThat(isIncreasing1).isTrue();

        boolean isIncreasing2 = monotonicArray.isMonotonic(new int[]{1, 2, 3});
        assertThat(isIncreasing2).isTrue();

        boolean isIncreasing3 = monotonicArray.isMonotonic(new int[]{5, 6, 7});
        assertThat(isIncreasing3).isTrue();


        boolean isIncreasing4 = monotonicArray.isMonotonic(new int[]{100, 101, 101});
        assertThat(isIncreasing4).isTrue();

        boolean isIncreasing5 = monotonicArray.isMonotonic(new int[]{1, 2, 2});
        assertThat(isIncreasing5).isTrue();

        boolean isIncreasing6 = monotonicArray.isMonotonic(new int[]{5, 6, 6});
        assertThat(isIncreasing6).isTrue();

    }

    @Test
    void should_return_true_if_array_monotone_decreasing() {

        boolean isIncreasing1 = monotonicArray.isMonotonic(new int[]{100, 99, 98});
        assertThat(isIncreasing1).isTrue();

        boolean isIncreasing2 = monotonicArray.isMonotonic(new int[]{3, 2, 1});
        assertThat(isIncreasing2).isTrue();

        boolean isIncreasing3 = monotonicArray.isMonotonic(new int[]{7, 6, 5});
        assertThat(isIncreasing3).isTrue();


        boolean isIncreasing4 = monotonicArray.isMonotonic(new int[]{45, 44, 44});
        assertThat(isIncreasing4).isTrue();

        boolean isIncreasing5 = monotonicArray.isMonotonic(new int[]{8, 7, 7});
        assertThat(isIncreasing5).isTrue();

        boolean isIncreasing6 = monotonicArray.isMonotonic(new int[]{4, 3, 3});
        assertThat(isIncreasing6).isTrue();

    }

    @Test
    void should_return_false_if_array_NOT_monotone_decreasing_AND_increasing() {

        boolean isIncreasing1 = monotonicArray.isMonotonic(new int[]{1, 3, 2});
        assertThat(isIncreasing1).isFalse();

        boolean isIncreasing2 = monotonicArray.isMonotonic(new int[]{7, 25, 4});
        assertThat(isIncreasing2).isTrue();

        boolean isIncreasing3 = monotonicArray.isMonotonic(new int[]{5, 10, 1});
        assertThat(isIncreasing3).isTrue();


        boolean isIncreasing4 = monotonicArray.isMonotonic(new int[]{4, 1, 8});
        assertThat(isIncreasing4).isTrue();

        boolean isIncreasing5 = monotonicArray.isMonotonic(new int[]{8, 7, 7});
        assertThat(isIncreasing5).isTrue();

        boolean isIncreasing6 = monotonicArray.isMonotonic(new int[]{4, 3, 3});
        assertThat(isIncreasing6).isTrue();

    }

}