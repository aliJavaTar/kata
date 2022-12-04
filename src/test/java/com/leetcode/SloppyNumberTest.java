package com.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SloppyNumberTest {

    SloppyNumber sloppyNumber;

    @BeforeEach
    void setUp() {
        sloppyNumber = new SloppyNumber();
    }

    @Test
    void should_return_false_if_array_NOT_monotone_decreasing_AND_increasing() {

        boolean isIncreasing1 = sloppyNumber.isSloppy(new int[]{1, 3, 2});
        assertThat(isIncreasing1).isTrue();

        boolean isIncreasing2 = sloppyNumber.isSloppy(new int[]{7, 25, 4});
        assertThat(isIncreasing2).isTrue();

        boolean isIncreasing3 = sloppyNumber.isSloppy(new int[]{5, 10, 1});
        assertThat(isIncreasing3).isTrue();


        boolean isIncreasing4 = sloppyNumber.isSloppy(new int[]{4, 1, 8});
        assertThat(isIncreasing4).isTrue();

        boolean isIncreasing5 = sloppyNumber.isSloppy(new int[]{8, 7, 48});
        assertThat(isIncreasing5).isTrue();

        boolean isIncreasing6 = sloppyNumber.isSloppy(new int[]{4, 3, 8});
        assertThat(isIncreasing6).isTrue();


        boolean isIncreasing7 = sloppyNumber.isSloppy(new int[]{1, 3, 2});
        assertThat(isIncreasing7).isTrue();

        boolean isIncreasing8 = sloppyNumber.isSloppy(new int[]{1, 3, 2, 4});
        assertThat(isIncreasing8).isTrue();


        boolean isIncreasing9 = sloppyNumber.isSloppy(new int[]{4, 2, 3, 1});
        assertThat(isIncreasing9).isTrue();

        boolean isIncreasing10 = sloppyNumber.isSloppy(new int[]{1, 3, 2, 4, 2, 4});
        assertThat(isIncreasing10).isTrue();


        boolean isIncreasing11 = sloppyNumber.isSloppy(new int[]{4, 2, 3, 1, 2});
        assertThat(isIncreasing11).isTrue();

    }
}