package org.example.car.dacia;

import org.example.car.Car;

public class Dacia extends Car {
    private String handle;

    public Dacia(String name, int HP, int speed, String handle) {
        super(name, HP, speed);
        this.handle = handle;
    }

    public Dacia(String name, int HP, String handle) {
        super(name, HP);
        this.handle = handle;
    }
}
