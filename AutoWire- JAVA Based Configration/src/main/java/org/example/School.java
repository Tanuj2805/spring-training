package org.example;

public class School implements Education{

    String name;

    public School() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void learn() {

    }
}
