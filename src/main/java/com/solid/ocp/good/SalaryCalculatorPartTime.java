package com.solid.ocp.good;

public class SalaryCalculatorPartTime implements SalaryCalculator {


    private static final int Half_Time = 2;

    @Override
    public double calculate(com.solid.ocp.good.Employee employee) {
        return employee.getBaseSalary() / Half_Time;
    }
}
