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


        System.out.println( "Hello World!" );
        ApplicationContext con = new ClassPathXmlApplicationContext("Context.xml"); //Initializing Application Context as a Container and using XML

        System.out.println("\nClass object with Prototype Scope\n");
        Alien b = (Alien)con.getBean("Alien"); //get Bean is returing plain object and we want a object of Alien so We type cast it as Alien

        b.i++;
        Alien c = (Alien)con.getBean("Alien");

        System.out.println("Value of first object i "+b.i);
        System.out.println("Value of second object i "+c.i);



        System.out.println("\nClass object with Prototype Scope\n");

        Laptop d = (Laptop) con.getBean("laptop");
        Laptop f = (Laptop) con.getBean("laptop");
        d.i++;
        System.out.println("Value of first object i "+d.i);
        System.out.println("Value of second object i "+f.i);



    }
}
