package com.codeWars.six.find_out_lier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindOutlierTest {

    private FindOutlier findOutlier;

    @BeforeEach
    void setUp() {
        findOutlier = new FindOutlier();
    }

    @Test
    void should_find_even_number() {
        int[] numbers = {3, 5, 2};

        assertThat(findOutlier.find(numbers)).isEqualTo(2);

        int[] numbers_1 = {11, 22, 35};

        assertThat(findOutlier.find(numbers_1)).isEqualTo(22);

        int[] numbers_2 = {1235, 213432, 355555555};

        assertThat(findOutlier.find(numbers_2)).isEqualTo(213432);
    }

    @Test
    void should_find_odd_number() {
        int[] numbers = {3, 4, 2};

        assertThat(findOutlier.find(numbers)).isEqualTo(3);

//        int[] numbers_1 = {11, 22, 35};
//
//        assertThat(findOutlier.find(numbers_1)).isEqualTo(22);
//
//        int[] numbers_2 = {1235, 213432, 355555555};
//
//        assertThat(findOutlier.find(numbers_2)).isEqualTo(213432);
    }

}
