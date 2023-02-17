package com.codeWars.dinglemouse.seven;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DinglemouseTest {

    @Test
    void ownedCatAndDog() {
        Dinglemouse dinglemouse = new Dinglemouse();
        int[] agesOfHuman = dinglemouse.ownedCatAndDog(15, 15);
        int[] age = {1, 1};
        assertThat(agesOfHuman).isEqualTo(age);
        ////////////////////////////////
        int[] agesOfHuman1 = dinglemouse.ownedCatAndDog(24, 24);
        int[] age1 = {2, 2};
        assertThat(agesOfHuman1).isEqualTo(age1);
        ////////////////////////////////
        int[] agesOfHuman2 = dinglemouse.ownedCatAndDog(28, 29);
        int[] age2 = {3, 3};
        assertThat(agesOfHuman2).isEqualTo(age2);
        ////////////////////////////////
        int[] agesOfHuman3 = dinglemouse.ownedCatAndDog(32, 34);
        int[] age3 = {4, 4};
        assertThat(agesOfHuman3).isEqualTo(age3);
        ////////////////////////////////
        int[] agesOfHuman4 = dinglemouse.ownedCatAndDog(36, 39);
        int[] age4 = {5, 5};
        assertThat(agesOfHuman4).isEqualTo(age4);
    }


}