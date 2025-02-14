package com.solid.ocp.good;

public class SalaryCalculatorPartTime implements SalaryCalculator {


    private static final int Half_Time = 2;

    @Override
    public double calculate(Employee employee) {
        return employee.getBaseSalary() / Half_Time;
    }
}
