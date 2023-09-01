package org.example.car.mercedes;

import org.example.car.Car;

public class Mercedes extends Car implements MercedesRepository {
    private String interior;

    public Mercedes(String name, int HP, int speed, String interior) {
        super(name, HP, speed);
        this.interior = interior;
    }

    @Override
    public void startTurbo() {

    }

    @Override
    public void superBrake() {

    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "name='" + getName() + '\'' +
                ", HP=" + getHP() +
                ", speed=" + getSpeed() +
                ", location='" + getLocation() + '\'' +
                ", interior='" + interior + '\'' +
                '}';
    }
}
