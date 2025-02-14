package com.solid.ocp.bad;

public class EmployeeFullTime extends Employee {

    public EmployeeFullTime(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return super.getBaseSalary();
    }
}
