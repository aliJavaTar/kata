package com.codeWars.football;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TotalPointsTest {
    private TotalPoints points;

    @BeforeEach
    void setUp() {
        points = new TotalPoints();
    }

    @Test
    void should_first_number_bigger_than_secound_number_return_three() {
        String[] match = {"1:0", "2:0", "3:0", "4:4", "2:2", "3:3", "1:4", "2:3", "2:4", "3:4"};
        int result = points.points(match);

        Assertions.assertThat(result).isEqualTo(12);
    }
}