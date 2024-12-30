package org.example;

public class Coder {

    Machine system;

    public Coder() {
        System.out.println("Coder Object Is Created");
    }

    public Machine getSystem() {
        return system;
    }

    public void setSystem(Machine system) {
        this.system = system;
    }

    public void code()
    {
        System.out.println("Coding...");
        system.compile();
    }
}
