package com.microdevs.baseservice.annotation;

import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalDateTimeFormatValidator implements ConstraintValidator<ValidLocalDateTimeFormat, LocalDateTime> {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    /**
     * Null value is considered valid. Use @NotNull for null checks.
     *
     * @param value object to validate
     * @param context context in which the constraint is evaluated
     *
     * @return true if value is empty and the parse operation does not receive an error, false if it gets an error
     */
    @Override
    public boolean isValid(LocalDateTime value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        try {
            String formattedDate = value.format(formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
