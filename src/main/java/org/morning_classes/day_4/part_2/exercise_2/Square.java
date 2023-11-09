package org.morning_classes.day_4.part_2.exercise_2;

public class Square implements Shape{
    double hight;
    @Override
    public double calculatePerimeter() {
        return 4*hight;
    }
}
