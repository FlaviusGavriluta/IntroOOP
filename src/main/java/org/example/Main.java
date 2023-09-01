package org.example;

import org.example.car.Car;
import org.example.car.dacia.Dacia;
import org.example.car.mercedes.Mercedes;
import org.example.car.mercedes.MercedesPlus;
import org.example.car.mercedes.MercedesPlusRepository;
import org.example.car.mercedes.MercedesRepository;
import org.example.car.tesla.Tesla;
import org.example.driver.Driver;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Mercedes("Mercedes Benz", 250, 200, "poor");
        Mercedes car2 = new Mercedes("Mercedes Benz", 360, 280, "luxury");
        MercedesRepository car22 = new Mercedes("Benz", 260, 180, "luxury");
        MercedesPlusRepository car23 = new MercedesPlus("C-class", 200, 130);

        Tesla car3 = new Tesla("Tesla", 300, 250, "ai");
        Dacia car4 = new Dacia("Dacia 1310", 200, "handle");
        Dacia car5 = new Dacia("Dacia 1310", 200, 120, "handle");

        car1.accelerate();
        car2.accelerate();
        car3.accelerate();
        car4.accelerate();
        car5.accelerate();

        Driver me = new Driver(car4, "John");
        me.moveCar("Brasov");

        List<Car> cars = new ArrayList<>();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        cars.stream().forEach(car -> System.out.println(car));

        System.out.println(car22);
        System.out.println(car23);
    }
}