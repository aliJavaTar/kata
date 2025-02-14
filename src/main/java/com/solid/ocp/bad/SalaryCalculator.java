package com.solid.ocp.bad;

public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        return employee.calculate(employee);
    }
}


