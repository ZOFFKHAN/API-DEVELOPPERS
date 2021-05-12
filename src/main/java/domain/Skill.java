package domain;

import fr.formation.developer.validation.UpperCase;

public class Skill {
    @UpperCase
    // @NotNull
    private String name;
    // private String name; on peut remplacer private par _name;

    // constructeur sans argument

    public Skill() {
    }

    // initialise name

    public void setName(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    @Override
    public String toString() {
	// TODO Auto-generated method stub
	return name;
    }

}
