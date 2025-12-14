package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Without Spring Framework
        //Student student = new Student();
        //student.show();

        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        System.out.println( "Hello World!" );

        /*
            Student student = context.getBean(Student.class);
            student.show();

            output:-
                Student Object Created
                Student Object Created
                Hello World!

            if we have single bean for this class then we can use above method to get the bean
            else if we have multiple beans for the same class then we need to use bean id or bean name to get the bean
            otherwise we will get org.springframework.beans.factory.NoUniqueBeanDefinitionException

            Student helloWorld2 = (Student) context.getBean("helloWorld2");
            helloWorld2.show();

            OUTPUT:-
                Student Object Created
                Student Object Created
                Hello World!
                Hello Student show method called
         */

        Student helloWorld2 = (Student) context.getBean("helloWorld2");
        helloWorld2.show();


    }
}
