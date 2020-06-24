package com.abclearning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MCQSystemTest {
    @Test
    void studentNameTest(){
        // Prompt for student name & Assign it to the new Student object
        String expectedResult = "Lim"; // Input for testing
        Student student = new Student(expectedResult);

        System.out.println("Test Case #1");
        System.out.println("\tExpected Result: " + expectedResult); // print expected result
        String actualResult = student.getName(); // Actual Result
        System.out.println("\tActual Result: " + actualResult); // Print actual result
        assertEquals(expectedResult, actualResult); // Compare the expected result (True) & Actual Result

    }
    @Test
    void studentMCQTotalAnsweredTest(){
        // Prompt for student name & Assign it to the new Student object
        Student student = new Student("Lim");

        int expectedResult = 10; // Input for testing
        student.setNumQuestionAns(expectedResult); // Set Total Number Question(s) Answered
        System.out.println("Test Case #2");
        System.out.println("\tExpected Result: " + expectedResult); // print expected result
        int actualResult = student.getNumQuestionAns(); // Actual Result
        System.out.println("\tActual Result: " + actualResult); // Print actual result
        assertEquals(expectedResult, actualResult); // Compare the expected result (True) & Actual Result
    }

    @Test
    void studentMCQTotalAnsweredCorrectlyTest(){
        // Prompt for student name & Assign it to the new Student object
        Student student = new Student("Lim");

        int expectedResult = 8; // Input for testing
        student.setNumCorrectAns(expectedResult); // Set Total Number Question(s) Answered Correctly
        System.out.println("Test Case #3");
        System.out.println("\tExpected Result: " + expectedResult); // print expected result
        int actualResult = student.getNumCorrectAns(); // Actual Result
        System.out.println("\tActual Result: " + actualResult); // Print actual result
        assertEquals(expectedResult, actualResult); // Compare the expected result (True) & Actual Result
    }

    @Test
    void studentMCQTotalAnsweredWronglyTest(){
        // Prompt for student name & Assign it to the new Student object
        Student student = new Student("Lim");

        int expectedResult = 2; // Input for testing
        student.setNumWrongAns(expectedResult); // Set Total Number Question(s) Answered Wrongly
        System.out.println("Test Case #4");
        System.out.println("\tExpected Result: " + expectedResult); // print expected result
        int actualResult = student.getNumWrongAns(); // Actual Result
        System.out.println("\tActual Result: " + actualResult); // Print actual result
        assertEquals(expectedResult, actualResult); // Compare the expected result (True) & Actual Result
    }

    @Test
    void studentMCQTotalScoreTest(){
        // Prompt for student name & Assign it to the new Student object
        Student student = new Student("Lim");
        student.setNumCorrectAns(8); // Set Total Number Question(s) Answered Correctly
        student.setNumQuestionAns(10); // Set Total Number Question(s) Answered Correctly


        double expectedResult = 80; // Input for testing
        // Calculate total score and set it
        student.setCalculatedScore(student.getNumCorrectAns(), student.getNumQuestionAns());
        System.out.println("Test Case #5");
        System.out.println("\tExpected Result: " + expectedResult); // print expected result
        double actualResult = student.getTotalScore(); // Actual Result
        System.out.println("\tActual Result: " + actualResult); // Print actual result
        assertEquals(expectedResult, actualResult); // Compare the expected result (True) & Actual Result
    }
}