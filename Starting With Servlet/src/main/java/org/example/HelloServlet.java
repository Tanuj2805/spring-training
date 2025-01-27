package org.example;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {


    public void service(HttpServletRequest rew, HttpServletResponse res) throws IOException {
        System.out.println("Hello EveryOne");
        res.getWriter().println("Hello");
    }
}
