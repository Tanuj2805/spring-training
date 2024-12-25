package org.spring1;

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
        ApplicationContext con = new ClassPathXmlApplicationContext(); //Initializing Application Context as a Container and using XML
        Alien a = (Alien)con.getBean("Alien"); //get Bean is returing plain object and we want a object of Alien so We type cast it as Alien




    }
}
