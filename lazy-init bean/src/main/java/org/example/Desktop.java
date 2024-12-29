package org.example;

public class Desktop implements Machine
{


    public Desktop()
    {

        System.out.println("Desktop Object Is Created");
    }

    public Desktop(Machine system)
    {
        System.out.println("Desktop Object Is Created");

    }

    @Override
    public void compile()
    {
        System.out.println("Compiling Using Desktop");
    }


}
