package Conditional_Statement;

public class Example {
    public static void main(String[] args) {
//        if Conditional_Statement.Example
        int age = 20;
        if (age > 18) {
            System.out.println("Age is greater than 18");
        }

//        if-else Conditional_Statement.Example
        int number = 13;
        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

//        if-else-if Conditional_Statement.Example
        int marks = 65;
        if (marks < 50) {
            System.out.println("Fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A grade");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("Invalid");
        }

        int number1 = 13;
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }


    }
}
