package org.example;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Java operators");

        // compare operators
        // equals operator ==
        // not equal !=
        int a = 5;
        int b = 6;
        boolean isAEqualToB = a == b;
        System.out.println("Is a equals to b?: " + isAEqualToB);
        a = b; // a = 6, b = 6
        if (a == b) {
            System.out.println("Same numbers");
        } else {
            System.out.println("Not the same");
        }

        boolean isANotEqualToB = a != b;
        System.out.println("Is A not equals to B?: " + isANotEqualToB);
    }
}





















