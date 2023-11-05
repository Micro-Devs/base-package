package com.microdevs.baseservice.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;;

public class EnumValidatorImpl implements ConstraintValidator<EnumValidator, CharSequence> {
    private EnumValidator annotation;

    @Override
    public void initialize(EnumValidator constraintAnnotation) {
        this.annotation = constraintAnnotation;
    }

    @Override
    public boolean isValid(CharSequence value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }

        Object[] enumValues = this.annotation.enumClass().getEnumConstants();
        if (enumValues != null) {
            for (Object enumValue : enumValues) {
                if (value.toString().equals(enumValue.toString())) {
                    return true;
                }
            }
        }
        return false;
    }
}
