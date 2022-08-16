package org.launchcode.java.demos.lsn5unittesting.main;

public class Main {

    public static void main(String[] args) {
        Car prius = new Car("Toyota", "Prius", 10, 50);
        System.out.println(prius.getMake() + " - " + prius.getModel());
    }
}
