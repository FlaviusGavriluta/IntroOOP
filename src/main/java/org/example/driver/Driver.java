package org.example.driver;

import org.example.car.Car;

public class Driver {
    private Car ownedCar;
    private String name;

    public Driver(Car ownedCar, String name) {
        this.ownedCar = ownedCar;
        this.name = name;
    }

    public void moveCar(String destination) {
        ownedCar.setLocation(destination);
    }
}
