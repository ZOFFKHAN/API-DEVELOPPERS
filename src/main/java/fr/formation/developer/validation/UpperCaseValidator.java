package fr.formation.developer.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UpperCaseValidator implements ConstraintValidator<UpperCase, String> {
//public class UpperCaseValidator implements ConstraintValidator<A, T> {

//A annotation
// T par le type cible
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
	// Value doit être en majuscule
	// Si value n'est pas en majuscules alors return false
	// Si value en majuscules alors return false
// comparer value à sa version en majuscules (forcer)

	if (value == null) {
	    return true;
	}
	// issue if value is null
	String uppercased = value.toUpperCase();

	return value.equals(uppercased);

	// return value.toUpperCase().equals(value);// TODO Auto-generated method stub
//return value == uppercased à ne pas faire;
    }
}
