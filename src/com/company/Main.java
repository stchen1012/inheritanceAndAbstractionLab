package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Vehicle car = new Car(true, "Automotive", "Land", 4);
        System.out.println(car.startEngine());

        Airplane airplane = new Airplane(true,"Plane", "Air",2);
        airplane.turbocharge();
    }
}
