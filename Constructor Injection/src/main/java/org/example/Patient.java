package org.example;

public class Patient {

    private int age;
    private String name;
    private int bill;

    public Patient(int age, String name, int bill) {
        this.age = age;
        this.name = name;
        this.bill = bill;
        System.out.println("Patient Object Created");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getBill() {
        return bill;
    }
}
