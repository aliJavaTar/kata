package com.codeWars.dinglemouse.seven;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DinglemouseTest {
    private Dinglemouse dinglemouse;

    @BeforeEach
    void setUp() {
        dinglemouse = new Dinglemouse();
    }

    @Test
    void ownedCatAndDog() {
        int[] agesOfHuman_1 = getAgesOfHuman4(0, 15);
        int[] age_1 = {0, 1};
        extracted(agesOfHuman_1, age_1);

        int[] agesOfHuman_2 = getAgesOfHuman4(11, 6);
        int[] age_2 = {0, 0};
        extracted(agesOfHuman_2, age_2);

        int[] agesOfHuman = getAgesOfHuman4(15, 15);
        int[] age = {1, 1};
        extracted(agesOfHuman, age);

        int[] agesOfHuman_3 = getAgesOfHuman4(16, 17);
        int[] age_3 = {1, 1};
        extracted(agesOfHuman_3, age_3);

        int[] agesOfHuman1 = getAgesOfHuman4(24, 24);
        int[] age1 = {2, 2};
        extracted(agesOfHuman1, age1);

        int[] agesOfHuman_4 = getAgesOfHuman4(26, 28);
        int[] age_4 = {2, 2};
        extracted(agesOfHuman_4, age_4);

        int[] agesOfHuman2 = getAgesOfHuman4(28, 29);
        int[] age2 = {3, 3};
        extracted(agesOfHuman2, age2);

        int[] agesOfHuman3 = getAgesOfHuman4(32, 34);
        int[] age3 = {4, 4};
        extracted(agesOfHuman3, age3);

        int[] agesOfHuman4 = getAgesOfHuman4(36, 39);
        int[] age4 = {5, 5};
        extracted(agesOfHuman4, age4);
    }

    private int[] getAgesOfHuman4(int catYears, int dogYears) {
        return dinglemouse.ownedCatAndDog(catYears, dogYears);
    }

    private void extracted(int[] actual, int[] expected) {
        assertThat(actual).isEqualTo(expected);
    }


}