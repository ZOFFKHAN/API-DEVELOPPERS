package fr.formation.developer.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import fr.formation.developer.validation.NameDiffDesc;

//@FieldsValueMatch.List({
//	@FieldsValueMatch(field = "name", fieldMatch = "description", message = "name and description do not match!") })
@NameDiffDesc
public class Project {

    @NotEmpty(message = "name is required")
    // @Size(min=1, max=5,message = "number of character between ")
    // @Pattern(regexp=".*[^ ].*",message = "should contains else than blanks ")
    @NotBlank
    @Size(min = 1, max = 255, message = "number of character between ")

    private String name;
    // change from private to pulic static
    // in order to use it outside as in UpperCase1

    // public static String name;
    @NotEmpty(message = "description is required")

    @NotBlank
    // @Size(min = 100, max = 1000, message = "number of character between 100 and
    // 1000 ")
    @Size(min = 1, max = 100, message = "number of character between 100 and 1000 ")

    private String description;

    // @NotEmpty(message = "date is required")
    @Future(message = "date can't be before today !")
    private LocalDate startingDate;

    private LocalDate endDate;
    // @NotNull not necessary cause optionnal
    // float is designed as primary
    // which is different from Float which is set to zero when initialise
    //

    @Positive
    private Float annualBudget;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public LocalDate getStartingDate() {
	return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
	this.startingDate = startingDate;
    }

    public LocalDate getEndDate() {
	return endDate;
    }

    public void setEndDate(LocalDate endDate) {
	this.endDate = endDate;
    }

    public float getAnnualBudget() {
	return annualBudget;
    }

    public void setAnnualBudget(float annualBudget) {
	this.annualBudget = annualBudget;
    }

    @Override
    public String toString() {
	return "Project [name=" + name + ", description=" + description + ", startingDate=" + startingDate
		+ ", endDate=" + endDate + ", annualBudget=" + annualBudget + "]";
    }

}
