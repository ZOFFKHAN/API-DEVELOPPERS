package fr.formation.developer.domain.dtos;

import javax.validation.constraints.Positive;

public class ProjectUpBudg {

    @Positive
    private Float annualBudget;

    public ProjectUpBudg() {
    }

    public Float getAnnualBudget() {
	return annualBudget;
    }

    public void setAnnualBudget(Float annualBudget) {
	this.annualBudget = annualBudget;
    }

    @Override
    public String toString() {
	return "ProjectUpBudg [annualBudget=" + annualBudget + "]";
    }

}
