package main.model.humanoids;

import main.model.animals.Animal;

import java.time.LocalDate;

public class Dwarf extends Humanoid {
    public Dwarf(String lastName, String firstName, LocalDate birth) {
        super(lastName, firstName, birth);
    }

    @Override
    public void getNewPet(Animal animal) {
        System.out.println("My new pet is: " + animal.getName());
    }
}
