package fr.formation.developer.domain.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Team {

    @NotEmpty(message = "name is required")
    // @Size(min=1, max=5,message = "number of character between ")
    // @Pattern(regexp=".*[^ ].*",message = "should contains else than blanks ")
    @NotBlank
    @Size(min = 1, max = 255, message = "number of character between ")
    private String name;

    private Boolean agile;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Boolean getAgile() {
	return agile;
    }

    public void setAgile(Boolean agile) {
	this.agile = agile;
    }

    @Override
    public String toString() {
	return "Team [name=" + name + ", agile=" + agile + "]";
    }

}
