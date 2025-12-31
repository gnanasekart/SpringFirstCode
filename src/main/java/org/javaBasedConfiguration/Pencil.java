package org.javaBasedConfiguration;

import org.springframework.stereotype.Component;

@Component
public class Pencil implements Writer {

    public Pencil() {
        System.out.println("Pencil Object Created");
    }

    public void write() {
        System.out.println("Pencil is writing...");
    }
}
