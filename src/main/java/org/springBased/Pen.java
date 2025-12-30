package org.springBased;

public class Pen implements Writer {

    public Pen() {
        System.out.println("Pen Object Created");
    }

    public void write() {
        System.out.println("Pen is writing...");
    }
}
