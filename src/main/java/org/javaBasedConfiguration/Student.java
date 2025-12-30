package org.javaBasedConfiguration;

import org.springBased.Writer;

public class Student {

    private int age;
    private int rollNo;

    private Writer writer;

    public void setWriter(Writer writer) {
        //System.out.println("setWriter method called");
        this.writer = writer;
    }



    public Student(int age, int rollNo, Writer writer) {
        System.out.println("Student Parameterized Constructor called");
        this.age = age;
        this.rollNo = rollNo;
        this.writer = writer;
    }

    public Student() {
        System.out.println("Student Default Constructor called");
    }

    public void show() {
        System.out.println("Hello Student show method called");
    }

    public void writeExam() {
        writer.write();
    }
}
