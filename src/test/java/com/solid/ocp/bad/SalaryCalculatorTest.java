package com.solid.ocp.bad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {
    private SalaryCalculator salaryCalculator;

    @BeforeEach
    void setUp() {
        salaryCalculator = new SalaryCalculator();
    }

    @Test
    void testFullTimeEmployeeSalary() {
        Employee fullTimeEmployee = new EmployeeFullTime("John Doe", 5000);
        assertEquals(5000, salaryCalculator.calculateSalary(fullTimeEmployee));
    }

    @Test
    void testPartTimeEmployeeSalary() {
        Employee partTimeEmployee = new EmployeePartTime("Jane Doe", 3000);
        assertEquals(1500, salaryCalculator.calculateSalary(partTimeEmployee));
    }

    @Test
    void EmployeeSalary() {
        Employee partTimeEmployee = new EmployeeHourly("Jane Doe", 3000, 2);
        assertEquals(6000, salaryCalculator.calculateSalary(partTimeEmployee));
    }


}