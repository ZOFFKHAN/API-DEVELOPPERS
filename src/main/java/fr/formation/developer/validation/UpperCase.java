package fr.formation.developer.validation;

//import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
//@Target(FIELD)
@Target(ElementType.FIELD)
@Constraint(validatedBy = { UpperCaseValidator.class })
public @interface UpperCase {

    // récupéré de @NotNull (ligne 39-42)
    String message() default "doit être en majuscule}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
