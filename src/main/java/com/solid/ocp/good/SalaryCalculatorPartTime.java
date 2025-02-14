package com.solid.ocp.good;

public class SalaryCalculatorPartTime implements SalaryCalculator {
    @Override
    public double calculate(Employee employee) {
        return employee.getBaseSalary() / 2 ;
    }
}
