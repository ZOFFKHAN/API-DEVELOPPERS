package fr.formation.developer.validation;

import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckadultValidator implements ConstraintValidator<Checkadult, LocalDate> {

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {

	if (value == null) {
	    return false;
	}

	LocalDate newDate = LocalDate.now();

	return newDate.minusYears(18).isAfter(value);

	// return value.plusYears(18).isBefore(newDate);
	// return true;

    }

    private Object now() {
	// TODO Auto-generated method stub
	return null;
    }

}
