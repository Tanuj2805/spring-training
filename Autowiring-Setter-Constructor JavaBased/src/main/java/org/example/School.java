package org.example;

import org.springframework.stereotype.Component;

@Component
public class School implements Education {


    String name = "NEMS";
    String city = "Nagpur";

    public School() {
        System.out.println("SCHOOL OBJECT CREATED");
    }



    @Override
    public void learn() {

        System.out.println("Learning In School");
        System.out.println("School name: "+name);
        System.out.println("City: "+city);

    }
}
