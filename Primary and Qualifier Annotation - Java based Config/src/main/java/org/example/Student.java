package org.example;

public class Student {



    //Default values are initialized in Container
    String Name;
    String Sname;
    int Roll;

    Education edu;

    public Student() {

        System.out.println("Student Object Created");
    }

    public Education getEdu() {
        return edu;
    }

    public void setEdu(Education edu) {
        this.edu = edu;
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
        edu.learn();
        System.out.println("School/College Name: "+Sname);
        System.out.println("ID code: "+Roll);

    }
}
