package org.example.Config;

import org.example.College;
import org.example.School;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Context {



    @Bean //By default Scope of Bean is Singleton
    public School sch()     //By default Name is sch
    {
        return new School();
    }


    @Bean
    @Scope("prototype") //Scope is set to prototype
    public College col()
    {
        return new College();
    }


}
