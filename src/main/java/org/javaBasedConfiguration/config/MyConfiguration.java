package org.javaBasedConfiguration.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.javaBasedConfiguration")
public class MyConfiguration {

    /**
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

    */

}
