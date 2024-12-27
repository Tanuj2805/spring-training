package org.example;

public class Car {

    private String Name;
    private String Model;

    public Car(String name, String model) {
        System.out.println("Car Object Created");
        Name = name;
        Model = model;
    }

    public String getName() {
        return Name;
    }

    public String getModel() {
        return Model;
    }
}
