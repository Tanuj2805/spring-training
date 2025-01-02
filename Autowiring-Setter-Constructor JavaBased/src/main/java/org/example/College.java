package org.example;

public class College implements Education{

    String name;
    String city;

    public College() {
        System.out.println("COLLEGE OBJECT CREATED");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void learn() {

        System.out.println("Learning In College");

    }
}
