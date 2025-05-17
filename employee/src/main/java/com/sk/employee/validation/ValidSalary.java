package com.sk.employee.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = SalaryValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidSalary {
    String message() default "Salary must be greater than 0 and less than or equal to 1,000,000";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
