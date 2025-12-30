package org.springBased;

import lombok.Data;

@Data
public class StudentLombok {

    private int age;
    private int rollNo;
    private Writer writer;

    public StudentLombok() {
        //System.out.println("Student Object Created");
    }

    public StudentLombok(int age, int rollNo, Writer writer) {
        System.out.println("Student_Lombok Parameterized Constructor called");
        this.age = age;
        this.rollNo = rollNo;
        this.writer = writer;
    }

    public void show() {
        System.out.println("Hello Student_L show method called");
    }

    public void writeExam() {
        writer.write();
    }
}
