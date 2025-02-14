package com.solid.ocp.bad;

public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        return employee.calculateSalary();
    }
}


//        return switch (employee.getEmploymentType()) {
//            case FULL_TIME -> employee.getBaseSalary();
//            case PART_TIME -> employee.getBaseSalary() / 2;
////            case CONTRACTOR -> ;  Tell don't ask
//        };