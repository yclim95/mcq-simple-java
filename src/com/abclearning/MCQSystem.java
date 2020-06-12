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
            System.out.println("\nEnter 'y' if want to continue again!");
            reload = input.nextLine();
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
        Student student;
        MCQuestion javaMCQ;
        MCQuestion htmlMCQ;
        MCQuestion excelMCQ;
        MCQuestion dotNetMCQ;
        int courseSelection;

        System.out.print("Enter Your Name: ");
        student = new Student(input.nextLine()); //Create student object
        displayCourse();

        courseSelection = input.nextInt();

        if (courseSelection == 1) { //If it is Java MCQ
            //Create JavaMCQ Object
            javaMCQ = new JavaMCQ("src\\com\\abclearning\\java.csv");
            // read & MCQ Question & Prompt for answer
            javaMCQ.readMCQuestion(input, student);
        } else if (courseSelection == 2) { //If it is HTML MCQ
            //Create HtmlMCQ Object
            htmlMCQ = new HtmlMCQ("src\\com\\abclearning\\html.csv");
            // read & MCQ Question & Prompt for answer
            htmlMCQ.readMCQuestion(input, student);
        } else if (courseSelection == 3) { //If it is Excel MCQ
            //Create ExcelMCQ Object
            excelMCQ = new ExcelMCQ("src\\com\\abclearning\\excel.csv");
            // read & MCQ Question & Prompt for answer
            excelMCQ.readMCQuestion(input, student);
        } else if (courseSelection == 4){//If it is .NET MCQ
            //Create DotNetMCQ Object
            dotNetMCQ = new DotNetMCQ("src\\com\\abclearning\\dotnet.csv");
            // read & MCQ Question & Prompt for answer
            dotNetMCQ.readMCQuestion(input, student);
        }

    }

}
