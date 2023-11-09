package org.morning_classes.day_4.part_1.exercise_1.exercise_1;

public class DogFood {
    private String foodName;

    public DogFood(String food) {
        this.foodName = food;
    }

    public void eat() {
        System.out.println("Dog eats " + foodName);
    }
}
