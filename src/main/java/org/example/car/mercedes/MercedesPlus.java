package org.example.car.mercedes;

import org.example.car.Car;

public class MercedesPlus extends Car implements MercedesRepository,MercedesPlusRepository{
    public MercedesPlus(String name, int HP, int speed) {
        super(name, HP, speed);
    }

    public MercedesPlus(String name, int HP) {
        super(name, HP);
    }

    @Override
    public void gradualBrake() {

    }

    @Override
    public void startTurbo() {

    }

    @Override
    public void superBrake() {

    }
}
