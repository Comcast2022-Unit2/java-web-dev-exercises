package org.launchcode.java.demos.lsn6inheritance.lecture;

// Truck is a subclass of Car
public class Truck extends Car {
    private double bedSize;
    private double towingCapacity;

    public Truck(String make, String model, Integer year, double bedSize, double towingCapacity) {
        super(make, model, year);
        this.bedSize = bedSize;
        this.towingCapacity = towingCapacity;
    }

    public double getBedSize() {
        return bedSize;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }
}
