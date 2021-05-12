package domain;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import fr.formation.developer.validation.Checkadult;

public class DeveloperUpdate {

    @Checkadult
    @NotNull
    private LocalDate birthDate;

    public DeveloperUpdate() {
    }

    public LocalDate getBirthDate() {
	return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
    }

    @Override
    public String toString() {
	return "DeveloperUpdate [birthDate=" + birthDate + "]";
    }

}
