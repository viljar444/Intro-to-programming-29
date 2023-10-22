package org.example;

public class FirstFunction {

    public static void main(String[] args) {
        System.out.println("Lets`s play with functions");
        // call function with name and arguments
        firstFunction();
        System.out.println("In the middle");
        firstFunction();
        secondFunction();
    }

    // public static - let's ignore for now
    // function has got name, arguments, return type
    // return type: void - means nothing
    // name: firstFunction
    // arguments: inside pair of brackets - here no arguments
    public static void firstFunction() {
        System.out.println("Inside first function - line1");
        secondFunction();
        System.out.println("Inside first function - line2");
    }

    public static void secondFunction() {
        System.out.println("My second function");
    }
}