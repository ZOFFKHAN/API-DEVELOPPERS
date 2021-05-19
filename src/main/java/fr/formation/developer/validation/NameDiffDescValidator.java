package fr.formation.developer.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.developer.domain.dtos.Project;

//public class UpperCaseValidator1 implements ConstraintValidator<UpperCase1, String> {
public class NameDiffDescValidator implements ConstraintValidator<NameDiffDesc, Project> {
// change from String to Object [] in order to access the class

    // here Project refer the class Project
    // in order to annotate the class itself
    // public class UpperCaseValidator implements ConstraintValidator<A, T> {

//A annotation
// T par le type cible
    @Override
    public boolean isValid(Project value, ConstraintValidatorContext context) {

	return !value.getDescription().equals(value.getName());
// ! not , in order to retrieve error if name is same as the description
	// we've been able to access to the getters because they have been defined
	// as public in the 'Project' class

    }
}
