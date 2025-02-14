package com.solid.ocp.good;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.solid.ocp.good.EmploymentType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SalaryCalculatorShould {
    private SalaryCalculator calculator;

    @BeforeEach
    void setUp() {
//        salaryCalculator = new SalaryCalculator();
    }

    @Test
    void calculateAmountOfSallyAsFullTime() {
        calculator = new SalaryCalculatorFullTime();
        Employee employee = new Employee("John Doe", FULL_TIME, 5000);
        employee.calculate(calculator);
        assertEquals(5000, salaryCalculator.calculate(employee));
    }

    @Test
    void testPartTimeEmployeeSalary() {
        salaryCalculator = new SalaryCalculatorPartTime();
        Employee employee = new Employee("John Doe", PART_TIME, 5000);
        assertEquals(2500, salaryCalculator.calculate(employee));
    }


}