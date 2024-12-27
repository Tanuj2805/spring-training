package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con = new ClassPathXmlApplicationContext("Context.xml");

        Patient a = (Patient) con.getBean("patient");
        System.out.println("Patient Constructor Which depends on Sequence of Arguments in XML File");
        System.out.println("NAME: "+a.getName());
        System.out.println("AGE: "+a.getAge());
        System.out.println("BILL: "+a.getBill());

        Car b = (Car) con.getBean("car");
        System.out.println("Car Constructor Which depends on index of Arguments in XML File");
        System.out.println("NAME: "+b.getName());
        System.out.println("Model: "+b.getModel());

        City c = (City) con.getBean("city");
        System.out.println("City Constructor Which depends on name of Arguments in XML File");
        System.out.println("NAME: "+c.getName());
        System.out.println("Population: "+c.getPopulation());

        Disease d = (Disease) con.getBean("disease");
        System.out.println("Disease Constructor Which depends on datatype of Arguments in XML File");
        System.out.println("Disease NAME: "+d.getDname());
        System.out.println("Patient Name: "+d.getPname());
        System.out.println("Patient Surname: "+d.getSurname());





    }
}
