package org.example;

public class Homework {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Starting calculations");
        System.out.println();
        System.out.println("Operation 1. Subtraction:");
        System.out.println();
        subtractionTwoNumbers(14, 24);
        subtractionTwoNumbers(120, 100);
        subtractionTwoNumbers(10000, 1000);

        System.out.println();

        System.out.println("Operation 2. Division:");
        System.out.println();
        divisionTwoNumbers(81, 9);
        divisionTwoNumbers(9, 2);
        divisionTwoNumbers(15, 2);

        System.out.println();

        System.out.println("Operation 3. Multiplication:");
        System.out.println();
        multiplicationTwoNumbers(4, 4);
        multiplicationTwoNumbers(10, 10);

        System.out.println();

        System.out.println("Operation 4. Addition with four numbers:");
        System.out.println();
        addFourNumbers(10, 10, 10, 10);
        addFourNumbers(2, 1, 4, 3);
        addFourNumbers(15, 15, 30, 30);




    }

    public static void subtractionTwoNumbers(int first, int second) {
        System.out.println("First number is: " + first + ", second number is: " + second);
        int sum = first - second;
        System.out.println("The result of the subtraction is: " + sum);
    }

    public static void divisionTwoNumbers(float first, float second) {
        System.out.println("First number is: " + first + ", second number is: " + second);
        float sum = first / second;
        System.out.println("The result of the division is: " + sum);
    }

    public static void multiplicationTwoNumbers(int first, int second) {
        System.out.println("First number is: " + first + ", second number is: " + second);
        int sum = first * second;
        System.out.println("The result of the multiplication is: " + sum);
    }

    public static void addFourNumbers(int first, int second, int third, int fourth) {
        System.out.println("The numbers are: " + first + ", " + second + ", " + third + ", " + fourth);
        int sum = first + second + third + fourth;
        System.out.println("The sum of these numbers is: " + sum);
    }


}
