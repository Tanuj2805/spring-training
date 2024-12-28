package org.example;

public class laptop implements Machine {
    public laptop() {
        System.out.println("Laptop Obj Created");
    }

    public void compile()
    {
        System.out.println("Compiling Using Laptop");
    }
}
