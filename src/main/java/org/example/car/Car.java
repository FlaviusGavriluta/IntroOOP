package org.example.car;

public abstract class Car {
    private String name;
    private int HP;
    private int speed;
    private String location;

    public Car(String name, int HP, int speed) {
        this.name = name;
        this.HP = HP;
        this.speed = speed;
        this.location = "home";
    }

    public Car(String name, int HP) {
        this.name = name;
        this.HP = HP;
        this.speed = 0;
    }

    public void accelerate() {
        speed += 10;
        System.out.println("Current speed is " + speed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", HP=" + HP +
                ", speed=" + speed +
                ", location='" + location + '\'' +
                '}';
    }
}
