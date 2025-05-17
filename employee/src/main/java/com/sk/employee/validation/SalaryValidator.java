package com.sk.employee.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class SalaryValidator implements ConstraintValidator<ValidSalary, Double> {

    @Override
    public boolean isValid(Double salary, ConstraintValidatorContext context) {
        return salary != null && salary > 0 && salary <= 1_000_000;
    }
}
