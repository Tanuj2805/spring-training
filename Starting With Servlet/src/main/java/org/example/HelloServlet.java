package org.example;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {


    public void service(HttpServletRequest rew, HttpServletResponse res)
    {
        System.out.println("Hello EveryOne");
    }
}
