package main.model.humanoids;

import main.model.Gender;
import main.model.animals.Animal;

import java.time.LocalDate;
import java.util.List;

public class Human extends Humanoid {
    protected Gender gender;

    public Human(Gender gender) {
        this.gender = gender;
    }

    public Human(String lastName, String firstName, LocalDate birth, Gender gender) {
        super(lastName, firstName, birth);
        this.gender = gender;
    }

    public Human(String lastName, String firstName, LocalDate birth, boolean isSad, List<Animal> petsOwned, Gender gender) {
        super(lastName, firstName, birth, isSad, petsOwned);
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


}
