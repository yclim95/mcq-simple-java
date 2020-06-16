/*
 * Created by: Lim Yao Cheng
 * MCQ System
 */
package com.abclearning;

import java.util.Scanner;

public class MCQSystem {
    /*
     * Global Declaration
     */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //Initialize
        String reload;
        //Start
        do {
            System.out.println("ABC Learning Centre");
            displayMCQ();
            System.out.print("\nEnter 'y' if want to continue again!: ");
            reload = input.next();
            System.out.println();
        } while (reload.toUpperCase().equals("Y"));

    }

    public static void displayCourse() {
        System.out.println("\nCourse List");
        System.out.println("1. Java");
        System.out.println("2. HTML");
        System.out.println("3. Microsoft Excel");
        System.out.println("4. .NET Programming");
        System.out.print("\nSelect a course [1-4]: ");
    }

    public static void displayMCQ() {
        Student student; //Initialize class datatype
        MCQuestion javaMCQ; //Initialize class datatype
        MCQuestion htmlMCQ; //Initialize class datatype
        MCQuestion excelMCQ; //Initialize class datatype
        MCQuestion dotNetMCQ; //Initialize class datatype
        int courseSelection;

        System.out.print("Enter Your Name: ");
        student = new Student(input.nextLine()); //Create student object
        displayCourse();

        courseSelection = input.nextInt();

        if (courseSelection == 1) { //If it is Java MCQ
            //Create JavaMCQ Object - abstract class (run-time polymorphism)
            javaMCQ = new JavaMCQ();
            // read & MCQ Question & Prompt for answer - Inheritance
            javaMCQ.readMCQuestion(input, student);
        } else if (courseSelection == 2) { //If it is HTML MCQ
            //Create HtmlMCQ Object - abstract class (run-time polymorphism)
            htmlMCQ = new HtmlMCQ();
            // read & MCQ Question & Prompt for answer - Inheritance
            htmlMCQ.readMCQuestion(input, student);
        } else if (courseSelection == 3) { //If it is Excel MCQ
            //Create ExcelMCQ Object - abstract class (run-time polymorphism)
            excelMCQ = new ExcelMCQ();
            // read & MCQ Question & Prompt for answer - Inheritance
            excelMCQ.readMCQuestion(input, student);
        } else if (courseSelection == 4) {//If it is .NET MCQ
            //Create DotNetMCQ Object - abstract class (run-time polymorphism)
            dotNetMCQ = new DotNetMCQ();
            // read & MCQ Question & Prompt for answer - Inheritance
            dotNetMCQ.readMCQuestion(input, student);
        }

    }

}
