package main.model.humanoids;

import main.model.Gender;
import main.model.animals.Animal;

import java.time.LocalDate;
import java.util.List;

public class Humanoid implements HumanoidInterface {

    protected String lastName;
    protected String firstName;
    protected LocalDate birth;
    protected boolean isSad;

    protected List<Animal> petsOwned;

    public Humanoid() {}

    public Humanoid(String lastName, String firstName, LocalDate birth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birth = birth;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public boolean isSad() {
        return isSad;
    }

    public List<Animal> getPetsOwned() {
        return petsOwned;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public void setSad(boolean sad) {
        isSad = sad;
    }

    public void setPetsOwned(List<Animal> petsOwned) {
        this.petsOwned = petsOwned;
    }

    @Override
    public void getNewPet(Animal animal) {
        this.getPetsOwned().add(animal);
        System.out.println("My new pet is: " + animal.getName());
        System.out.println(this.getPetsOwned());
    }

    @Override
    public void feedPets() {
        System.out.println("Here is your food, buddy.");
    }

    @Override
    public void renamePet(Animal animal, String newName) {
        animal.setName(newName);
        System.out.println("Your new name is : " + animal.getName());
    }

}
