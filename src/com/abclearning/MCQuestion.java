package com.abclearning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public abstract class MCQuestion { //abstract class
    Student student; //Initialize class datatype

    // Abstraction (abstract method)
    public abstract String getFileName();

    public abstract String getMcqName();

    // Inheritance
    public void readMCQuestion(Scanner input, Student student) {
        String csvFile = getFileName();
        String[] mcQuestion;
        String answer;
        String line;
        String csvSplitBy = ",";
        int correctA = 0;
        int wrongA = 0;
        int numQ = 0;
        BufferedReader fileReader;

        try {
            fileReader = new BufferedReader(new FileReader(csvFile));
            System.out.println("\n" + this.getMcqName() + " MCQ Question");

            // Keep looping until no more row to read
            while ((line = fileReader.readLine()) != null) {
                mcQuestion = line.split(csvSplitBy);
                System.out.println(mcQuestion[0] + "\n" + mcQuestion[1] + "\n" + mcQuestion[2] +
                        "\n" + mcQuestion[3] + "\n" + mcQuestion[4]);

                System.out.print("\nYour answer is: ");
                answer = input.next();

                if (mcQuestion[5].equals(answer.toLowerCase())) {
                    System.out.println("WELL DONE!\n");
                    correctA++;
                } else {
                    System.out.print("WRONG ANSWER.");
                    System.out.println("The correct Answer is: " + mcQuestion[6] + "\n");
                    wrongA++;
                }
                numQ++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.student = student; // Set this.student = student (Reference) - Aggregation
        // this.student.getName() -> encapsulation
        this.student.displayScore(this.student.getName(), correctA, wrongA, numQ);
    }
}
