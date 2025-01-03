package org.example;

import io.micrometer.observation.Observation;
import org.example.config.context;
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
        ApplicationContext con = new AnnotationConfigApplicationContext(context.class);
        Student st = con.getBean(Student.class);
        st.getdata();
    }
}
