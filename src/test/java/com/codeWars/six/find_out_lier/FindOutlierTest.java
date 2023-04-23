package com.codeWars.six.find_out_lier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        int[] numbers = {2,6,8,-10,3};

        assertThat(findOutlier.find(numbers)).isEqualTo(3);


        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        assertEquals(206847684, findOutlier.find(exampleTest2));
        assertEquals(0, findOutlier.find(exampleTest3));
    }

}
