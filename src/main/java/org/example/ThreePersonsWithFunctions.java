package org.example;

public class ThreePersonsWithFunctions {

    public static void main(String[] args) {
        int age = 55;
        int johnAge = 5;
        int marthaAge = 19;

        isAdult(100);
        isAdult(10);

        System.out.println("Now with our variables");
        isAdult(age);
        isAdult(johnAge);
        isAdult(marthaAge);
    }

    public static void isAdult(int age) {
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