package main.model.humanoids;

import main.model.Gender;

import java.time.LocalDate;

public class Human extends Humanoid {
    protected Gender gender;

    public Human(Gender gender) {
        this.gender = gender;
    }

    public Human(String lastName, String firstName, LocalDate birth, Gender gender) {
        super(lastName, firstName, birth);
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
