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

    @Override
    public String toString() {
        return "My car is a " +
                this.getYear() + " " +
                this.getMake() + " " +
                this.getModel() + ".\n" +
                "Bed size: " + this.getBedSize() + "ft\n" +
                "Towing Cap: " + this.getTowingCapacity() + " lbs";
    }
}
