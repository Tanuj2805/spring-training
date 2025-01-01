package org.example;

public class School implements Education{

    String name;

    public School() {

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
        System.out.println("Learning In School");
    }
}
