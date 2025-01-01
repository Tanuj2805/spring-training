package org.example;

public class College implements Education {


    String name;

    public College() {

        System.out.println("School Object Created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void learn() {
        System.out.println("Learning In College");
    }
}
