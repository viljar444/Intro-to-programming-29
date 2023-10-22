package org.example;

public class SimpleCalculator {

    public static void main(String[] args) {
        System.out.println("Starting calculations");

        addTwoNumbers(1, 2);
        addTwoNumbers(25, 17);
        addTwoNumbers(255, 17);

        int first = 5;
        int second = 6;
        addTwoNumbers(first, second);
        addTwoNumbers(first, first);
    }

    public static void addTwoNumbers(int firstNumber, int secondNumber) {
        // First number is: 1, second number is: 5
        System.out.println("First number is: " + firstNumber + ", second number is: " + secondNumber);

        int sum = firstNumber + secondNumber;
        System.out.println("Sum of two numbers is: " + sum);
    }
}