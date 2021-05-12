package domain;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import fr.formation.developer.validation.Checkadult;

public class Developer {

    private String nickname;
    private String lastname;
    private String firstname;

    @NotNull
    @Checkadult
    private LocalDate birthDate;

    public Developer() {
    }

    public String getNickname() {
	return nickname;
    }

    public void setNickname(String nickname) {
	this.nickname = nickname;
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    public String getFirstname() {
	return firstname;
    }

    public void setFirstname(String firstname) {
	this.firstname = firstname;
    }

    public LocalDate getBirthDate() {
	return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
    }

    @Override
    public String toString() {
	// TODO Auto-generated method stub
	return nickname + " " + lastname + " " + birthDate + "";
    }

}
