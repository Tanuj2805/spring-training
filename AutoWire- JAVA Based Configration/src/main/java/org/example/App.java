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

        Student st1 = con.getBean(Student.class);
        st1.getdata();
    }
}
