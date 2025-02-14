package com.solid.ocp.bad;

public class EmployeePartTime extends Employee {
    public EmployeePartTime(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return super.getBaseSalary() / 2;
    }
}
