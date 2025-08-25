package com.kn.exceptionhandling;

// Custom Checked Exception
class ExceptionDemo extends Exception {
    public ExceptionDemo() {
        super("You are not eligible for vote because you are below 18");
    }
}

public class CustomException {
    public static void main(String[] args) {
        int age = 15;

        try {
            if (age < 18) {
                throw new ExceptionDemo();
            } else {
                System.out.println("You are eligible to vote.");
            }
        } catch (ExceptionDemo e) {
            System.out.println("We Solved our Exception Gracefully");
            System.out.println(e.getMessage()); 
           
        }
    }
}
