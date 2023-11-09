package org.morning_classes.day_3;

public class Task implements Runnable {
    private String name;
    private String message;

    public Task(String name) {
        this.name = name;
        this.message = "Task - ";
    }

    public Task(String name, String message) {
        this.name = name;
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message + name + " thread: " + Thread.currentThread().getName());
    }
}
