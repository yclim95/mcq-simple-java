package com.abclearning;

public class Student {
    // Data encapsulation
    private final String name; // Student name
    private double totalScore; // Total score
    private int numCorrectAns; // Number of Correct Answer
    private int numWrongAns; // Number of Wrong Answer
    private int numQuestionAns; // Total Number of question Answered

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

    //Data Encapsulation
    public double getTotalScore() {
        return this.totalScore;
    }

    //Data Encapsulation
    public int getNumCorrectAns() {
        return this.numCorrectAns;
    }

    public void setNumCorrectAns(int numCorrectAns) {
        this.numCorrectAns = numCorrectAns;
    }

    //Data Encapsulation
    public int getNumWrongAns() {
        return this.numWrongAns;
    }

    public void setNumWrongAns(int numWrongAns) {
        this.numWrongAns = numWrongAns;
    }

    //Data Encapsulation
    public int getNumQuestionAns() {
        return this.numQuestionAns;
    }
    public void setNumQuestionAns(int numQuestionAns) {
        this.numQuestionAns = numQuestionAns;
    }

    public void displayScore() {
        setCalculatedScore(this.getNumCorrectAns(), this.getNumQuestionAns()); // Calculate & Set Total Score
        System.out.println("\nScore");

        System.out.println("Congratulations " + name);
        System.out.println("Total Questions: " + this.getNumQuestionAns());
        System.out.println("Total Correct: " + this.getNumCorrectAns());
        System.out.println("Total Incorrect: " + this.getNumWrongAns());
        System.out.println("Total score(%): " + this.getTotalScore() + " %");
    }
}
