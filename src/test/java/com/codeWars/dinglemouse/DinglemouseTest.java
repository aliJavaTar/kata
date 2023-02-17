package com.codeWars.dinglemouse;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DinglemouseTest {
    private Dinglemouse age;

    @BeforeEach
    void setUp() {
        age = new Dinglemouse();
    }

    @Test
    void humanYearsCatYearsDogYears() {
        int[] ages = age.humanYearsCatYearsDogYears(1);

        int[] expected = {1,15,15};

        Assertions.assertThat(ages).isEqualTo(expected);
        //////////////////////////////////////////////
        int[] ages1 = age.humanYearsCatYearsDogYears(2);

        int[] expected1 = {2,24,24};

        Assertions.assertThat(ages1).isEqualTo(expected1);
        //////////////////////////////////////////////
        int[] ages2 = age.humanYearsCatYearsDogYears(3);

        int[] expected2 = {3,28,29};

        Assertions.assertThat(ages2).isEqualTo(expected2);
        //////////////////////////////////////////////
        int[] ages3 = age.humanYearsCatYearsDogYears(4);

        int[] expected3 = {4,32,34};

        Assertions.assertThat(ages3).isEqualTo(expected3);
        //////////////////////////////////////////////
        int[] ages4 = age.humanYearsCatYearsDogYears(5);

        int[] expected4 = {5,36,39};

        Assertions.assertThat(ages4).isEqualTo(expected4);
    }
}