package com.company;

public abstract class FactoryCar {
    public Car orderCar(String type) {
        Car car;

        car = createCar(type);

        car.prepare();
        car.manufacture();
        car.test();
        car.deliver();

        return car;
    }

    protected abstract Car createCar(String type);
}
