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


        //ITS FOR PRIMITIVE DATA TYPE
        Coder a = (Coder) con.getBean("code1");//Type Casting because it returns generic object

        System.out.println("Default Value of Language Variable : "+a.getLanguage());

        a.setLanguage("KOTLIN");

        System.out.println("Changed Value of Language Variable : "+a.getLanguage());


        //REF PROPERTY OF SYSTEM

        a.code();
    }
}
