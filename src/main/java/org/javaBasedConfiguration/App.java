package org.javaBasedConfiguration;

import org.javaBasedConfiguration.config.MyConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        //Student student = context.getBean(Student.class); // if only one bean of Student class is present
        //Student student = (Student) context.getBean("student"); // by method name
        //Student student = (Student) context.getBean("stud"); // by bean name defined in @Bean annotation

        Student student = context.getBean(Student.class);
        student.writeExam();
        System.out.println("Student Roll No: " + student.getRollNo());


    }
}
