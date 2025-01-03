package org.example;

import org.springframework.stereotype.Component;

@Component
public class Student {

    String name;
    int rn;

    public Student() {

        System.out.println("STUDENT OBJECT CREATED");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRn() {
        return rn;
    }

    public void setRn(int rn) {
        this.rn = rn;
    }

    public void getdata()
    {
        System.out.println("NAME: "+name);
        System.out.println("Roll No: "+rn);
    }


}
