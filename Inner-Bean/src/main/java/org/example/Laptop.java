package org.example;

public class Laptop implements Machine
{


    public Laptop() {

        System.out.println("Laptop Object Is Created");

    }

    @Override
    public void compile() {

        System.out.println("Compiling Using Laptop");

    }
}
