package org.launchcode.java.demos.lsn6inheritance.lecture;
// Make, Model, Year
public class Car {
    private String make;
    private String model;
    private Integer year;

    public Car(String make, String model, Integer year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "My car is a " +
                this.year + " " +
                this.make + " " +
                this.model + ".\n";
    }
}
