package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );
        Tomcat tom = new Tomcat();

        Context con = tom.addContext("",null);
        tom.addServlet(con,"HelloServlet",  new HelloServlet());
        con.addServletMappingDecoded("/hello","HelloServlet");

        tom.start();
        tom.getServer().await();
    }
}
