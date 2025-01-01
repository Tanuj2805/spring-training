package org.example.Config;


import org.example.College;
import org.example.Education;
import org.example.School;
import org.example.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Context {

    @Bean
    public Student stu(@Qualifier("cl") Education ed)//@Autowired Is Optional And if you dont want to use primary you can add @Qualifier Annotation here "public Student stu( @Qualifier("cl") Education ed)"
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

    @Bean
   // @Primary
    public School sc()
    {
        return new School();
    }

}
