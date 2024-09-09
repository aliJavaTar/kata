package com.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SubArrayShould {
    @Test
    void findMaximumSubarraySum() {

        int[] array = {-7, 3, -1, 2, -4, 3};
        var subArray = new SubArray(array);
        int result = subArray.subArr(array);
        Assertions.assertThat(result).isEqualTo(4);

    }
}