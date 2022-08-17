package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        // Let's create an instance of the Car class
        Car tacoma = new Car("Toyota", "Tacoma", 2002);
        System.out.println("My car is a " +
                tacoma.getYear() + " "
                + tacoma.getMake() + " "
                + tacoma.getModel()
        );
    }


}
