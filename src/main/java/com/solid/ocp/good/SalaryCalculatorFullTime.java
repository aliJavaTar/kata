package com.solid.ocp.good;



public class SalaryCalculatorFullTime implements SalaryCalculator {

    @Override
    public double calculate(Employee employee) {
        return employee.getBaseSalary();
    }
}
