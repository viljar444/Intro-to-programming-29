package org.example;

public class ThreePersonsWithFunctions {

    public static void main(String[] args) {
        int age = 55;
        int johnAge = 5;
        int marthaAge = 19;

        checkAge(100);
        checkAge(10);

        System.out.println("Now with our variables");
        checkAge(age);
        checkAge(johnAge);
        checkAge(marthaAge);
    }

    public static void checkAge(int age) {
        System.out.println("Current age is: " + age);
        if (age >= 18) {
            System.out.println("If is true");
            System.out.println("Adult");
        } else {
            System.out.println("Else, if was false");
            System.out.println("Kid");
        }
    }
}