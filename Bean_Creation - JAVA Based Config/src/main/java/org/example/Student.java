package org.example;

public class Student {

    int rn;
    String Name;

    public Student() {

        System.out.println("Student Object Created");
    }

    public int getRn() {
        return rn;
    }

    public void setRn(int rn) {
        this.rn = rn;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
