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


        Coder a = (Coder) con.getBean("code");
        //Here Coder class is depend on one class and we are passing laptop object using constructor
        // As the both the class is declared lazy init so only when it is need at that time only it will create the object
        //Here desktop is not needed so it dosen't create it
        //To more understand compare with Autowire file
        a.coding();



    }
}
