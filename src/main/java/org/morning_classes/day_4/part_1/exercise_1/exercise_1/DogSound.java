package org.morning_classes.day_4.part_1.exercise_1.exercise_1;

public class DogSound {
    private String sound;

    public DogSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void bark(){
        System.out.println("Dog barks " + sound);
    }
}
