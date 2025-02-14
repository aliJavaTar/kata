package com.solid.ocp.good;

import com.solid.ocp.bad.CalculateSalary;

public class EmployeeService {
    private final CalculateSalary calculateSalary;

    public EmployeeService(CalculateSalary calculateSalary) {
        this.calculateSalary = calculateSalary;
    }

    public double getSalary() {
        return calculateSalary.calculateSalary();
    }
}
