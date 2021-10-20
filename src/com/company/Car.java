package com.company;

public abstract class Car {
    String name;
    String color;
    String engineSize;
    String wheelType;

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Painting the car...");
        System.out.println("Setting new engine...");
    }

    void manufacture() {
        System.out.println("Manufacturing takes approximately 17-20 hours");
    }

    void test() {
        System.out.println("Testing a new car");
    }

    void deliver() {
        System.out.println("Delivering our car. It takes 5-7 days");
    }

    public String getName() {
        return name;
    }
}
