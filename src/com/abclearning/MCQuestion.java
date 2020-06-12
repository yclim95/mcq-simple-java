package com.abclearning;

import java.util.Scanner;

public abstract class MCQuestion {
    // Data encapsulation
    private String fileName;

    public MCQuestion(String fileName) {
        this.fileName = fileName;
    }

    // Data encapsulation
    public String getFileName() {
        return this.fileName;
    }

    // Abstraction
    public abstract void readMCQuestion(Scanner input, Student student);
}
