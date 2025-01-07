package com.example.Spring.boot;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class School implements Education {



    String name;
    String City;

    @Value("${School.intake}")
    int intake;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getIntake() {
        return intake;
    }

    public void setIntake(int intake) {
        this.intake = intake;
    }

    @Override
    public void getinfo() {
        System.out.println("School Name: "+name);
        System.out.println("School City: "+City);
        System.out.println("Intake: "+intake);

    }
}
