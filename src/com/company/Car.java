package com.company;

public class Car extends Vehicle {
    private int numOfWheels;

    public Car(boolean hasEngine, String type, String meansOfTransportation, int numOfWheels) {
        super(hasEngine, type, meansOfTransportation);
        this.numOfWheels = numOfWheels;
    }

    @Override
    public String startEngine() {
        return "This goes vroom vroom";
    }
}
