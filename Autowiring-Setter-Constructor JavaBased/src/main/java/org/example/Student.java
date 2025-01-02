package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

    String name;
    int rn;

    @Autowired
    @Qualifier("clg")
    Education ed;

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

    public Education getEd() {
        return ed;
    }

    public void setEd(Education ed) {
        this.ed = ed;
    }

    public void getdata()
    {
        System.out.println("Student NAME: "+name);
        System.out.println("Roll No: "+rn);
        ed.learn();
    }


}
