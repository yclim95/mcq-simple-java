package com.abclearning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class JavaMCQ extends MCQuestion{

    Student student;

    public JavaMCQ(String fileName) {
        super(fileName);
    }

    @Override
    public void readMCQuestion(Scanner input, Student student) {
        String csvFile = getFileName();
        String [] mcQuestion;
        String answer;
        String line;
        String csvSplitBy = ",";
        int correctA = 0;
        int wrongA = 0;
        int numQ = 0;
        BufferedReader fileReader;

        try{
            fileReader = new BufferedReader(new FileReader(csvFile));
            String mcqName = "\nJava Programming";
            System.out.println(mcqName + " MCQ Question");

            // Keep looping until no more row to read
            while ((line = fileReader.readLine()) !=  null){
                mcQuestion = line.split(csvSplitBy);
                System.out.println(mcQuestion[0] + "\n" + mcQuestion[1] + "\n" + mcQuestion[2] +
                        "\n" + mcQuestion[3] + "\n" + mcQuestion[4]);

                System.out.print("\nYour answer is: ");
                input.nextLine();  // Consume newline left-over
                answer = input.nextLine();

                if(mcQuestion[5].equals(answer.toLowerCase())){
                    System.out.println("Well Done");
                    correctA++;
                }else{
                    System.err.println("\nWrong answer");
                    System.out.println("The correct Answer is: " + mcQuestion[6]);
                    wrongA++;
                }
                numQ++;
            }
        }catch  (Exception e){
            e.printStackTrace();
        }
        this.student = student;
        this.student.displayScore(this.student.getName(),correctA,wrongA,numQ);
    }
}
