package com.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainTest {

    @Test
    void if_duplicated_number_exist_in_array_then_true() {
        int[] numbers = {1, 2, 3, 4, 2};
        var contain = new Contain(numbers);
        assertThat(contain.isDuplicated_set_l()).isTrue();

    }

    @Test
    void just_test() {

        var contain = new Contain(new  int[]{1, 2, 3, 4, 2});
        assertThat(contain.isAnagram("racecar","carrace")).isTrue();

    }
}