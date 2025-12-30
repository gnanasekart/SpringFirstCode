package org.javaBasedConfiguration;

import org.javaBasedConfiguration.Writer;

public class Student {

    private int rollNo;

    private Writer writer;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public  int getRollNo() {
        return rollNo;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public Writer getWriter() {
        return writer;
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
