package org.example.Config;


import org.example.College;
import org.example.Education;
import org.example.School;
import org.example.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Context {

    @Bean
    public Student stu(@Autowired Education ed)
    {
        Student st = new Student();
        st.setName("Tanuj");  //Default Name
        st.setRoll(11); //Default Roll no
        st.setSname("VIT"); //Default SName
        st.setEdu(ed);
        return st;
    }

    @Bean
    public College cl()
    {
        return new College();
    }


}
