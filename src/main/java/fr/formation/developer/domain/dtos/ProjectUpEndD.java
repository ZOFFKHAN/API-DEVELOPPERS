package fr.formation.developer.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

public class ProjectUpEndD {

    // @NotEmpty(message = "date is required")
    @NotNull
    @Future(message = "date can't before today !")

    private LocalDate endDate;

    public ProjectUpEndD() {
    }

    public LocalDate getEndDate() {
	return endDate;
    }

    public void setEndDate(LocalDate endDate) {
	this.endDate = endDate;
    }

    @Override
    public String toString() {
	return "ProjectUpEndD [endDate=" + endDate + "]";
    }

}
