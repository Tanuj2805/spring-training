package org.example;

public class School {

    String Name;
    String City;

    public School() {

        System.out.println("School Object Is Created");
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
