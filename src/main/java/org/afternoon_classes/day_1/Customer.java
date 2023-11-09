package org.afternoon_classes.day_1;

public class Customer implements Runnable{
    private String name;

    public Customer(String name){
        this.name = name;
    }
    @Override
    public void run() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
