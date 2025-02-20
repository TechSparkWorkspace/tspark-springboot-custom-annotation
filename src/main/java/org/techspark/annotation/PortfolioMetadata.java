package org.techspark.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)  // Applies to classes only
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Documented
public @interface PortfolioMetadata {
    String owner();

    String riskLevel();  // LOW, MEDIUM, HIGH

    String strategy();  // GROWTH, INCOME, VALUE, etc.

    String createdDate();

    String[] assets() default {}; // List of asset types
}
