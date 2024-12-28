package org.example;

public class coder {

    Machine lap;

    public void setlap(Machine lap) {
        this.lap = lap;
    }

    public Machine getlap() {
        return lap;
    }

    public void coding()
    {
        System.out.println("Coder is Coding ");
    }

    public void com()
    {
        lap.compile();
    }

}
