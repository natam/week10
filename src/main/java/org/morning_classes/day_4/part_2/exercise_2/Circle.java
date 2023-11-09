package org.morning_classes.day_4.part_2.exercise_2;

public class Circle implements Shape{
    private int radius;


    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
