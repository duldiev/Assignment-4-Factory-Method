package com.company;

public class NissanFactory extends FactoryCar {
    @Override
    protected Car createCar(String item) {
        if (item.equals("GT-R R34")) {
            return new SkylineGTR();
        } else if (item.equals("350z")) {
            return new Nissan350z();
        } else return null;
    }
}
