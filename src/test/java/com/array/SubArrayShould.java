package com.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SubArrayShould {
    @Test
    void findMaximumSubarraySum() {

        int[] array = {2, 3, -1, 5};
        var subArray = new SubArray(array);
        int result = subArray.calculateMax(array);
        Assertions.assertThat(result).isEqualTo(9);

    }
}