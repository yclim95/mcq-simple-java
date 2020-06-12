package com.abclearning;

public class Student {
    private String name; //Data Encapsulation
    private double totalScore; //Data Encapsulation

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    } //Data Encapsulation

    public void setCalculatedScore(int correct, int numQuestion) {
        this.totalScore = (correct / numQuestion) * 100;
    }

    public void displayScore(String name, int correctQ, int wrongQ, int numQuestion) {
        setCalculatedScore(correctQ, numQuestion);
        System.out.println("\nScore");

        System.out.println("Congratulations " + name);
        System.out.println("Total Correct: " + correctQ);

        System.out.println("Total Incorrect: " + wrongQ);
        System.out.println("Total score(%): " + this.totalScore + " %");
    }

}
