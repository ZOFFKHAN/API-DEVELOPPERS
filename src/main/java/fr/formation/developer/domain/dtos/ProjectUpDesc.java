package fr.formation.developer.domain.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProjectUpDesc {

    // @NotEmpty(message = "description is required")
    @NotNull
    @NotBlank
    @Size(min = 100, max = 1000, message = "number of character between 100 and 1000 ")

    private String description;

    public ProjectUpDesc() {
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    @Override
    public String toString() {
	return "ProjectUpDesc [description=" + description + "]";
    }

}
