package com.company;

public abstract class Vehicle {
    private boolean hasEngine;
    private String type;
    private String meansOfTransportation;
    private int topSpeed;

    public Vehicle() {

    }

    public Vehicle(boolean hasEngine, String type, String meansOfTransportation) {
        this.hasEngine = hasEngine;
        this.type = type;
        this.meansOfTransportation = meansOfTransportation;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMeansOfTransportation() {
        return meansOfTransportation;
    }

    public void setMeansOfTransportation(String meansOfTransportation) {
        this.meansOfTransportation = meansOfTransportation;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed() {
        this.topSpeed = topSpeed;
    }

    public abstract String startEngine();
}
