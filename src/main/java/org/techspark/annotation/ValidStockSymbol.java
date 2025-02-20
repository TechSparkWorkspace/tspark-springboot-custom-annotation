package org.techspark.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target(ElementType.FIELD)  // Can only be applied to fields
@Retention(RetentionPolicy.RUNTIME) // Available at runtime for validation
@Constraint(validatedBy = StockSymbolValidator.class) // Links to the validator logic
@Documented
public @interface ValidStockSymbol {

    String message() default "Invalid stock symbol";  // Default error message

    Class<?>[] groups() default {};  // Required for validation grouping

    Class<? extends Payload>[] payload() default {}; // Used for advanced validation metadata

}
