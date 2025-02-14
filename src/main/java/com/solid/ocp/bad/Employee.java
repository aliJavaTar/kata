package com.solid.ocp.bad;

public abstract class Employee implements CalculateSalary {
    private String name;
//    private EmploymentType employmentType;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

//    @Override
//    public double calculateSalary() {
//        return switch (this.employmentType) {
//            case FULL_TIME -> this.baseSalary;
//            case PART_TIME -> this.baseSalary / 2;
//        };
//    }

    public String getName() {
        return name;
    }

//    public EmploymentType getEmploymentType() {
//        return employmentType;
//    }

    public double getBaseSalary() {
        return baseSalary;
    }
}