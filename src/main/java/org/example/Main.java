package org.example;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Mercedes("Mercedes Benz", 250, 200, "poor");
        Mercedes car2 = new Mercedes("Mercedes Benz", 360, 280, "luxury");
        Tesla car3 = new Tesla("Tesla", 300, 250, "ai");
        Dacia car4 = new Dacia("Dacia 1310", 200, "handle");
        Dacia car5 = new Dacia("Dacia 1310", 200, 120, "handle");

        car1.accelerate();
        car2.accelerate();
        car3.accelerate();
        car4.accelerate();
        car5.accelerate();
    }
}