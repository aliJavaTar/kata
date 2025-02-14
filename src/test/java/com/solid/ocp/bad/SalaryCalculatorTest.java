package com.solid.ocp.bad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {
    private SalaryCalculator salaryCalculator;

    @BeforeEach
    void setUp() {
        salaryCalculator = new SalaryCalculator();
    }

    @Test
    void testFullTimeEmployeeSalary() {
        Employee fullTimeEmployee = new Employee("John Doe", EmploymentType.FULL_TIME, 5000);
        assertEquals(5000, salaryCalculator.calculateSalary(fullTimeEmployee));
    }

    @Test
    void testPartTimeEmployeeSalary() {
        Employee partTimeEmployee = new Employee("Jane Doe", EmploymentType.PART_TIME, 3000);
        assertEquals(1500, salaryCalculator.calculateSalary(partTimeEmployee));
    }


}