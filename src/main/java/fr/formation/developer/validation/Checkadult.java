package fr.formation.developer.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ FIELD, LOCAL_VARIABLE })
@Constraint(validatedBy = { CheckadultValidator.class })
public @interface Checkadult {
    String message() default "doit être Majeur}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
