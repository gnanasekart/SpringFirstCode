package org.springBased;

public class Student {

    //Always variables should be private
    //In spring term variables are called property
    private int age;
    private int rollNo;

    private Writer writer;

    public void setWriter(Writer writer) {
        //System.out.println("setWriter method called");
        this.writer = writer;
    }



    /**
     * Setter Injection

    private Pen pen;

    public Pen getPen() {
        System.out.println("getPen method called");
        return pen;
    }

    public void setPen(Pen pen) {
        System.out.println("setPen method called");
        this.pen = pen;
    }

    public void setRollNo(int rollNo) {
        System.out.println("setRollNo method called");
        this.rollNo = rollNo;
    }

    public int getAge() {
        System.out.println("getAge method called");
        return age;
    }

    public void setAge(int age) {
        System.out.println("setAge method called");
        this.age = age;
    }

     public void writeExam() {
     pen.write();
     }
    */

    public Student(int age, int rollNo, Writer writer) {
        System.out.println("Student Parameterized Constructor called");
        this.age = age;
        this.rollNo = rollNo;
        this.writer = writer;
    }

    public Student() {
        //System.out.println("Student Object Created");
    }

    public void show() {
        System.out.println("Hello Student show method called");
    }

    public void writeExam() {
        writer.write();
    }
}
