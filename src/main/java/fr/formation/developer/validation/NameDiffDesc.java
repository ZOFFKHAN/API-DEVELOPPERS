package fr.formation.developer.validation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(ElementType.TYPE)
// changed target to @Target(ElementType.TYPE) as we are no more dealing with 
// a field
//@Target(ElementType.FIELD)
@Constraint(validatedBy = { NameDiffDescValidator.class })
public @interface NameDiffDesc {

    // récupéré de @NotNull (ligne 39-42)
    String message() default "name must be different from description";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
