package com.codeWars.quarterOfYears;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuarterOfYearTest {
    private QuarterOfYear year;

    @Test
    void should_give_number_of_month_and_return_quarter_of_year() {
        year = new QuarterOfYear();
        int month = 1;
        int partOfYear = year.quarterOf(month);

        Assertions.assertThat(partOfYear).isEqualTo(1);
    }
}