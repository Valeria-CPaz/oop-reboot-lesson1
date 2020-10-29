package com.val;

public class Car {

    private String manufacture;
    // Constructor - gets called (or invoked) when you create instance of the class
    // Always has the same name as the class
    public Car(String _manufacture) {
        manufacture = _manufacture;
        System.out.println("Car is created");
    }
    //getter Method - allows you to retrieve the value of a private variable
    // You are controlling outside access to the members of your class
    public String getManufacture() {
        return manufacture;
    }

    @Override
    public String toString() {

        return String.format("Manufacturer: " + manufacture);
    }
}
