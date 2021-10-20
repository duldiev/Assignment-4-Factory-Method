package com.company;

public class LexusFactory extends FactoryCar {
    @Override
    protected Car createCar(String item) {
        if (item.equals("ES 350")) {
            return new LexusES350();
        } else if (item.equals("IS 350")) {
            return new LexusIS350();
        } else return null;
    }
}
