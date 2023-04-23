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
        int[] numbers = {11111, 44343, 45645643, 442345243, 3, 5, 2};

        assertThat(findOutlier.find(numbers)).isEqualTo(2);
    }

    @Test
    void should_find_odd_number() {

    }
}
