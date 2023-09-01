package org.example;

public class Mercedes extends Car {
    private String interior;

    public Mercedes(String name, int HP, int speed, String interior) {
        super(name, HP, speed);
        this.interior = interior;
    }
}
