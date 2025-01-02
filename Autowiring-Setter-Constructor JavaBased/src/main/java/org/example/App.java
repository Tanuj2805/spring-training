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

        Student a = con.getBean(Student.class);
        a.setName("Tanuj");
        a.setRn(11);

        a.getdata();
    }
}
