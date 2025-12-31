package org.javaBasedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int rollNo;

    //@Autowired
    //@Qualifier("pencil")
    private Writer writer;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public  int getRollNo() {
        return rollNo;
    }

    //@Autowired
    //@Qualifier("pencil")
    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public Writer getWriter() {
        return writer;
    }


    public Student() {
        System.out.println("Student Default Constructor called");
    }

    @Autowired
    public Student(@Qualifier("pencil") Writer writer) {
        System.out.println("Student Arg Constructor called");
        this.writer = writer;
    }

    public void show() {
        System.out.println("Hello Student show method called");
    }

    public void writeExam() {
        writer.write();
    }
}
