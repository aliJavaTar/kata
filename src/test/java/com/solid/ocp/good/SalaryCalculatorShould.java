package com.solid.ocp.good;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.solid.ocp.good.EmploymentType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SalaryCalculatorShould {
    private SalaryCalculator calculate;

    @BeforeEach
    void setUp() {
//        salaryCalculator = new SalaryCalculator();
    }

    @Test
    void calculateAmountOfSallyAsFullTime() {
        calculate = new SalaryCalculatorFullTime();
        Employee employee = new Employee("John Doe", FULL_TIME, 5000, calculate);
        assertEquals(5000, employee.calculateSalary());
    }

    @Test
    void testPartTimeEmployeeSalary() {
        calculate = new SalaryCalculatorPartTime();
        Employee employee = new Employee("John Doe", PART_TIME, 5000, calculate);
        assertEquals(2500, employee.calculateSalary());
    }


}