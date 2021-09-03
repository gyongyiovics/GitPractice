package main.model.animals;

import main.model.Food;
import main.model.humanoids.Humanoid;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;

public class Animal implements AnimalInterface {

    protected String name;
    protected LocalDate birth;
    protected String favoriteToy;
    protected Food favoriteFood;
    protected boolean isHungry;

    protected Humanoid owner;

    public Animal() {}

    public Animal(String name, LocalDate birth, String favoriteToy, Food favoriteFood, Humanoid owner) {
        this.name = name;
        this.birth = birth;
        this.favoriteToy = favoriteToy;
        this.favoriteFood = favoriteFood;
        this.owner = owner;
    }


    @Override
    public void eat() {
        System.out.println(getName() + " eats his food.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes sounds.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " plays.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public void setFavoriteFood(Food favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public void setOwner(Humanoid owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public Food getFavoriteFood() {
        return favoriteFood;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public Humanoid getOwner() {
        return owner;
    }
}
