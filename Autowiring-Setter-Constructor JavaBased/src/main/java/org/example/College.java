package org.example;

public class College implements Education{

    String name;
    String city;

    public College(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public void learn() {

    }
}
