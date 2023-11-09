package org.morning_classes.day_4.part_1.exercise_1.exercise_1;

public class Dog {
    private String name;
    private String breed;
    private DogSound dogSound;
    private DogFood dogFood;

    public Dog(String name, String breed, double weight, String food) {
        this.name = name;
        this.breed = breed;
        dogFood = new DogFood(food);
        dogSound = new DogSound("Gav");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark(){
        dogSound.bark();
    }

    public void eat(){
        dogFood.eat();
    }
}
