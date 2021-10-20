package com.company;

public class MercedesFactory extends FactoryCar {
    @Override
    protected Car createCar(String item) {
        if (item.equals("GLS")) {
            return new MaybachSClass();
        } else if (item.equals("S-Class")) {
            return new MaybachSClass();
        } else return null;
    }
}
