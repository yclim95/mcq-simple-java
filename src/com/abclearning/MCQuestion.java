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
        String csvFile = getFileName(); // Retrieve CSV Filename
        String[] mcQuestion; // Store MCQuestion in an array
        String answer; // user's input for answer
        String line; // Each line in CSV File
        String csvSplitBy = ","; // csv splitter to break to different point
        int correctA = 0; // Number of Correct Answer
        int wrongA = 0; // Number of Wrong Answer
        int numQ = 0; // Total Number of question
        BufferedReader fileReader; // Read CSV File
        boolean valid; // use to check if user's input is valid

        try {
            fileReader = new BufferedReader(new FileReader(csvFile));
            System.out.println("\n" + this.getMcqName() + " MCQ Question");

            // Keep looping until no more row to read
            while ((line = fileReader.readLine()) != null) {
                mcQuestion = line.split(csvSplitBy);
                System.out.println(mcQuestion[0] + "\n" + mcQuestion[1] + "\n" + mcQuestion[2] +
                        "\n" + mcQuestion[3] + "\n" + mcQuestion[4]); //display MCQ


               do{
                   System.out.print("\nYour answer is: ");
                   answer = input.next();
                   if (mcQuestion[5].equals(answer.toLowerCase())) { // mcq answer == user's answer
                       System.out.println("WELL DONE!\n");
                       correctA++;
                       valid = true;
                   } else if (!(mcQuestion[5].equals(answer.toLowerCase())) && (answer.toLowerCase().equals("a") ||
                           answer.toLowerCase().equals("b") || answer.toLowerCase().equals("c") ||
                           answer.toLowerCase().equals("d"))){ // mcq answer != user's answer && == "a" "b" "c" "d"
                       System.out.print("WRONG ANSWER!");
                       System.out.println("The correct Answer is: " + mcQuestion[6] + "\n");
                       wrongA++;
                       valid = true;
                   }else{ // Other than the above
                       System.out.println("INVALID INPUT. Please enter only [a-d]!");
                       valid = false;
                   }
               }while(!valid); // While is not valid, keep prompting user for input
                numQ++; // Increment Number of Question ~ to get Total Number of Question

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.student = student; // Set this.student = student (Reference) - Aggregation
        // this.student.getName() -> encapsulation
        this.student.setNumCorrectAns(correctA); // Set Total Number of Correct Answered Question(s)
        this.student.setNumWrongAns(wrongA); // Set Total Number of Wrong Answered Question(s)
        this.student.setNumQuestionAns(numQ); // Set Total Number of Answered Question(s)
        this.student.displayScore(); // Display score
    }
}
