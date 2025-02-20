package org.techspark.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class StockSymbolValidator implements ConstraintValidator<ValidStockSymbol, String> {

    private static final Pattern SYMBOL_PATTERN = Pattern.compile("^[A-Z]{1,5}$"); // Standard stock symbols

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return value != null && SYMBOL_PATTERN.matcher(value).matches();
    }
}
