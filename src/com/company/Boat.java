package com.company;

public class Boat extends Vehicle {
    private int numOfRudders;

    public Boat(boolean hasEngine, String type, String meansOfTransportation, int numOfRudders) {
        super(hasEngine, type, meansOfTransportation);
        this.numOfRudders = numOfRudders;
    }

    @Override
    public String startEngine() {
        return "this goes beep";
    }
}
