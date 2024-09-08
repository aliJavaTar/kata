package com.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SubArrayShould {
    @Test
    void findMaximumSubarraySum() {
        //     {5, 4, 1, 7, 8}
        int[] array = {2, 3, -8, 7, -1, 2, 3};

        var subArray = new SubArray(array);
        int result = subArray.findMaximumSubarraySum();
        Assertions.assertThat(result).isEqualTo(11);
    }
}