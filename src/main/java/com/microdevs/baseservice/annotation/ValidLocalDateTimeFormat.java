package com.microdevs.baseservice.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = LocalDateTimeFormatValidator.class)
@Target({ FIELD })
@Retention(RUNTIME)
public @interface ValidLocalDateTimeFormat {
    String message() default "Invalid date format, should be yyyy-MM-ddTHH:mm:ss";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
