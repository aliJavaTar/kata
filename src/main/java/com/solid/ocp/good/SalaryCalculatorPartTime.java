package com.solid.ocp.good;

public class SalaryCalculatorPartTime implements SalaryCalculator {


    @Override
    public double calculate(com.solid.ocp.good.Employee employee) {
        return employee.getBaseSalary() / 2;
    }
}
