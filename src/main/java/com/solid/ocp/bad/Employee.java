package com.solid.ocp.bad;

public class Employee {
    private String name;
    private EmploymentType employmentType;
    private double baseSalary;

    public Employee(String name, EmploymentType employmentType, double baseSalary) {
        this.name = name;
        this.employmentType = employmentType;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public EmploymentType getEmploymentType() {
        return employmentType;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}