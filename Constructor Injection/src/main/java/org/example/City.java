package org.example;

import javax.management.ConstructorParameters;
import java.beans.ConstructorProperties;

public class City {

    private String Name;
    private String Population;


    @ConstructorProperties({"n","p"}) // Imp to give name to parameter else contructor will go with sequence
    public City(String name, String population) {
        System.out.println("City Object Created");
        Name = name;
        Population = population;
    }

    public String getName() {
        return Name;
    }

    public String getPopulation() {
        return Population;
    }
}
