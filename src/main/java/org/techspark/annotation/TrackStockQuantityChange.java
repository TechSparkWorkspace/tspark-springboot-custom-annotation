package org.techspark.annotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD) // Applies to methods
@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Documented
public @interface TrackStockQuantityChange {
    String value() default "Tracking stock quantity change";
}
