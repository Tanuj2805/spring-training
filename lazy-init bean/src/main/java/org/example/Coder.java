package org.example;

public class Coder {

    Machine system;


    public Machine getSystem() {
        return system;
    }

    public void setSystem(Machine system) {
        this.system = system;
    }


    public void coding()
    {
        System.out.println("Started coding");
        system.compile();
    }



}
