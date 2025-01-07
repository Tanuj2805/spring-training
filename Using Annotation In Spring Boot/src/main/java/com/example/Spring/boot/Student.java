package com.example.Spring.boot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {


    private int rollno;

    @Value("${Student.name}")
    private String name;

    @Value("pune")
    private String Address;

    Education ed;

    public Education getEd() {
        return ed;
    }

    @Autowired
    public void setEd(Education ed) {
        this.ed = ed;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }


    public void getdata()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollno);
        System.out.println("Address: "+Address);
        ed.getinfo();


    }
}
