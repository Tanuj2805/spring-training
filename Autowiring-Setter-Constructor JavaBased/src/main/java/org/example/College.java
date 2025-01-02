package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("clg") //name of bean
//@Primary Can also be used
public class College implements Education{

    String name = "VIT";
    String city = "pune";

    public College() {
        System.out.println("COLLEGE OBJECT CREATED");

    }

    @Override
    public void learn() {

        System.out.println("Learning In College");
        System.out.println("College name: "+name);
        System.out.println("City: "+city);

    }
}
