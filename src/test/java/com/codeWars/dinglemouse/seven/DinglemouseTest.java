package com.codeWars.dinglemouse.seven;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class DinglemouseTest {

    @Test
    void ownedCatAndDog() {
        Dinglemouse dinglemouse = new Dinglemouse();
        int[] agesOfHuman = dinglemouse.ownedCatAndDog(15, 15);
        int[] age = {1,1};
        assertThat(agesOfHuman).isEqualTo(age);
        ////////////////////////////////
        int[] agesOfHuman1 = dinglemouse.ownedCatAndDog(24, 24);
        int[] age1 = {2,2};
        assertThat(agesOfHuman1).isEqualTo(age1);
    }
}