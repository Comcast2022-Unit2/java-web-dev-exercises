package org.launchcode.java.demos.lsn6inheritance.lecture;

public class Main {
    public static void main(String[] args) {
        // Let's create an instance of the Car class
        Truck tacoma = new Truck("Toyota", "Tacoma", 2002, 7, 10000);
//        System.out.println("My car is a " +
//                tacoma.getYear() + " " +
//                tacoma.getMake() + " " +
//                tacoma.getModel() + ".\n" +
//                "Bed size: " + tacoma.getBedSize() + "ft\n" +
//                "Towing Cap: " + tacoma.getTowingCapacity() + " lbs"
//        );
        System.out.println(tacoma.toString());
    }


}
