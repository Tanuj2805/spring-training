package org.example.Config;

import org.example.School;
import org.example.Student;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Context {

    @Bean
    public Student st() //By Default The Name of Bean is st
    {
        return new Student();
    }

    @Bean(name = "Sch") //You Can Also Provide Multiple Names By " @Bean(name = {"Sch","Schooool","School1"}) "
    public School school()
    {
        return new School();
    }
}
