package com.abclearning;

public class Student {
    private final String name; //Data Encapsulation
    private double totalScore; //Data Encapsulation

    //Data Encapsulation
    public Student(String name) {
        this.name = name;
    }

    //Data Encapsulation
    public String getName() {
        return this.name;
    }

    public void setCalculatedScore(int correct, int numQuestion) {
        this.totalScore = ((double) correct / (double) numQuestion) * (double) 100;
    }

    public void displayScore(String name, int correctQ, int wrongQ, int numQuestion) {
        setCalculatedScore(correctQ, numQuestion);
        System.out.println("\nScore");

        System.out.println("Congratulations " + name);
        System.out.println("Total Questions: " + numQuestion);
        System.out.println("Total Correct: " + correctQ);
        System.out.println("Total Incorrect: " + wrongQ);
        System.out.println("Total score(%): " + this.totalScore + " %");
    }
}
