package com.solid.ocp.bad;

public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        return switch (employee.getEmploymentType()) {
            case FULL_TIME -> employee.getBaseSalary();
            case PART_TIME -> employee.getBaseSalary() / 2;
//            case CONTRACTOR -> ;
        };
    }
}