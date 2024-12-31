package org.example;

import org.example.Config.Context;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con = new AnnotationConfigApplicationContext(Context.class);

        System.out.println("\nClass With Singleton Scope\n");
        School school1 = con.getBean(School.class);
        School school2 = con.getBean(School.class);

        System.out.println("Value of I in School 1: "+school1.i);
        System.out.println("Value of I in School 2: "+school2.i);

        school1.i++;

        System.out.println("\nAfter Incrementation of I in School 1\n");

        System.out.println("Value of I in School 1: "+school1.i);
        System.out.println("Value of I in School 2: "+school2.i);



        System.out.println("\nClass With Prototype Scope\n");
        College clg1 = con.getBean(College.class);
        College clg2 = con.getBean(College.class);

        System.out.println("\nValue of I in College 1: "+clg1.i);
        System.out.println("Value of I in College 2: "+clg2.i);

        clg1.i++;

        System.out.println("\nAfter Incrementation of I in College 1\n");

        System.out.println("Value of I in College 1: "+clg1.i);
        System.out.println("Value of I in College 2: "+clg2.i);
    }
}
