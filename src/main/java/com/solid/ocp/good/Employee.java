package com.solid.ocp.good;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Employee {
    private String name;
    private EmploymentType employmentType;
    private double baseSalary;
    private final SalaryCalculator salaryCalculator;

    public Employee(SalaryCalculator salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }

    public double calculateSalary() {
        return salaryCalculator.calculate(this);
    }
//    public double calculate(CalculateSalary calculateSalary) {
//        return switch (getEmploymentType()) {
//            case FULL_TIME -> new SalaryCalculatorFullTime().calculate();
//            case PART_TIME ->  new SalaryCalculatorPartTime().calculate();
//        };
//    }
}
