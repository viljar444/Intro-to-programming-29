package org.example;

public class ThreePersonsCondition {

    public static void main(String[] args) {
        int age = 55;

        if (age >= 18) {
            System.out.println("If is true");
            System.out.println("Adult");
        } else {
            System.out.println("Else, if was false");
            System.out.println("Kid");
        }

        int johnAge = 5;
        if (johnAge >= 18) {
            System.out.println("If is true");
            System.out.println("Adult");
        } else {
            System.out.println("Else, if was false");
            System.out.println("Kid");
        }

        int martaAge = 19;
        if (martaAge >= 18) {
            System.out.println("If is true");
            System.out.println("Adult");
        } else {
            System.out.println("Else, if was false");
            System.out.println("Kid");
        }
    }
}
