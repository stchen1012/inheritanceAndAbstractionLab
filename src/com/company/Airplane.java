package com.company;

import com.company.Turbo;

public class Airplane extends Vehicle implements Turbo {
    private int numOfWings;

    public Airplane(boolean hasEngine, String type, String meansOfTransportation, int numOfWings) {
        super(hasEngine, type, meansOfTransportation);
        this.numOfWings = numOfWings;
    }

    @Override
    public String startEngine() {
        return "this goes swish";
    }

    @Override
    public void turbocharge() {
        System.out.println("Turbocharge");
    }
}
