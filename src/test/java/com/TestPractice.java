package com;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TestPractice {
    @Test
    @EnabledIf("isSunday")
    public void test() {
        System.out.printf("isSunday: %b", isSunday());
    }

    @Test
    @DisabledIf("isSunday")
    public void test_() {
        System.out.println("isSunday");
    }

    private boolean isSunday() {
        return LocalDate.now().getDayOfWeek() == DayOfWeek.SUNDAY;
    }
}
