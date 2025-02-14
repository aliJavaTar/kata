package com.solid.ocp.good;

import com.solid.ocp.bad.CalculateSalary;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    private String name;
    private EmploymentType employmentType;
    private double baseSalary;

    public double calculate(CalculateSalary calculateSalary) {
        return switch (getEmploymentType()) {
            case FULL_TIME -> new SalaryCalculatorFullTime().calculate(this);
            case PART_TIME -> new SalaryCalculatorPartTime().calculate(this);
        };
    }
}
