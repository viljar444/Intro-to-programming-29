package org.example;

public class HomeworkCalculator {

    public static void main(String[] args) {
        System.out.println("Using my homework calculator");
        int sum1 = add(10, 15);
        int numberOne = 11;
        System.out.println("number one is: " + numberOne);
        int numberTwo = 15;
        add(numberOne, numberTwo);
        int bigSum = addManyNumbers(1, 1, 2, 2, 1);
        System.out.println("Big sum of numbers is: " + bigSum);
    }

    public static int add(int a, int b) {
        System.out.println("Received parameters, a = " + a + ", b = " + b);
        int result = a + b;
        System.out.println("Calculation result is: " + result);
        return result;
    }

    public static int addManyNumbers(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}