package org.example.car.tesla;

import org.example.car.Car;

public class Tesla extends Car {
    private String ai;

    public Tesla(String name, int HP, int speed, String ai) {
        super(name, HP, speed);
        this.ai = ai;
    }

    @Override
    public void accelerate() {
        setSpeed(getSpeed() + 40);
        System.out.println("Car speed is " + getSpeed());
    }
}
