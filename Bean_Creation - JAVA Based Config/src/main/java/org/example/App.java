package org.example;

import org.example.Config.Context;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
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

        Student st1 = con.getBean(Student.class);//Used Class for Bean Creation

        st1.setName("Tanuj");
        st1.setRn(11);

        System.out.println("Name : "+st1.getName());
        System.out.println("Roll NO: "+st1.getRn());

    }
}
