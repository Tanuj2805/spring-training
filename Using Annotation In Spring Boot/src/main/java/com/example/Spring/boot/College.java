package com.example.Spring.boot;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College implements Education{



    @Value("${College.name}")

    String name;

    @Value("${College.City}")
    String City;

    @Value("${College.intake}")
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
        System.out.println("College Name: "+name);
        System.out.println("College City: "+City);
        System.out.println("Intake: "+intake);

    }
}
