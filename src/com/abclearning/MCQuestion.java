package com.abclearning;

import java.util.Scanner;

public abstract class MCQuestion {
    private String fileName;

    public MCQuestion(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public abstract void readMCQuestion(Scanner input, Student student);


}
