package com.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IncreaseNumberTest {
    private MonotonicNumber monotonicNumber;

    @BeforeEach
    void setUp() {
        monotonicNumber = new MonotonicNumber();
    }

    @Test
    void should_return_true_if_array_monotone_increasing() {

        boolean isIncreasing1 = monotonicNumber.isMonotonic(new int[]{100, 101, 102});
        assertThat(isIncreasing1).isTrue();

        boolean isIncreasing2 = monotonicNumber.isMonotonic(new int[]{1, 2, 3});
        assertThat(isIncreasing2).isTrue();

        boolean isIncreasing3 = monotonicNumber.isMonotonic(new int[]{5, 6, 7});
        assertThat(isIncreasing3).isTrue();


        boolean isIncreasing4 = monotonicNumber.isMonotonic(new int[]{100, 101, 101});
        assertThat(isIncreasing4).isTrue();

        boolean isIncreasing5 = monotonicNumber.isMonotonic(new int[]{1, 2, 2});
        assertThat(isIncreasing5).isTrue();

        boolean isIncreasing6 = monotonicNumber.isMonotonic(new int[]{5, 6, 6});
        assertThat(isIncreasing6).isTrue();

    }
    @Test
    void should_return_true_if_array_monotone_increaseNumber() {

        boolean isIncreasing1 = monotonicNumber.isMonotonic(new int[]{100, 99, 98});
        assertThat(isIncreasing1).isTrue();

        boolean isIncreasing2 = monotonicNumber.isMonotonic(new int[]{3, 2, 1});
        assertThat(isIncreasing2).isTrue();

        boolean isIncreasing3 = monotonicNumber.isMonotonic(new int[]{7, 6, 5});
        assertThat(isIncreasing3).isTrue();


        boolean isIncreasing4 = monotonicNumber.isMonotonic(new int[]{45, 44, 44});
        assertThat(isIncreasing4).isTrue();

        boolean isIncreasing5 = monotonicNumber.isMonotonic(new int[]{8, 7, 7});
        assertThat(isIncreasing5).isTrue();

        boolean isIncreasing6 = monotonicNumber.isMonotonic(new int[]{4, 3, 3});
        assertThat(isIncreasing6).isTrue();

    }
}