package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {




    @Value("Tanuj")
    String Name;

    @Value("VIT")
    String Sname;

    @Value("34")
    int Roll;



    public Student() {

        System.out.println("Student Object Created");
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        Roll = roll;
    }

    public void getdata()
    {
        System.out.println("Name: "+Name);
        System.out.println("School/College Name: "+Sname);
        System.out.println("ID code: "+Roll);

    }
}
