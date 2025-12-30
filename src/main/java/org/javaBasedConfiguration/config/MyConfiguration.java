package org.javaBasedConfiguration.config;

import org.javaBasedConfiguration.Pen;
import org.javaBasedConfiguration.Pencil;
import org.javaBasedConfiguration.Student;
import org.javaBasedConfiguration.Writer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfiguration {

    @Bean
    //@Bean(name = "stud")
    //@Scope("singleton")
    public Student student(@Qualifier("pencil") Writer writer) {//behind the screenwriter has @Autowired
        Student student = new Student();
        student.setRollNo(22);
        student.setWriter(writer);

        return student;
    }

    @Bean
    @Primary
    public Pen pen(){
        return new Pen();
    }

    @Bean
    public Pencil pencil(){
        return new Pencil();
    }
}
