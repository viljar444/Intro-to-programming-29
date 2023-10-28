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

        //divide
        // / - slash
        // \ - backslash

        System.out.println("Divide 5/2 = " + 5/2);
        System.out.println("Divide 5.0/2 = " + 5.0/2);
        System.out.println("Divide 5/2.0 = " + 5/2.0);
        System.out.println("Divide 5.0/2.0 = " + 5.0/2.0);

        // remainder operator
        // %
        // 5/2 = 2 and 1
        // 8/3 = 2 and 2
        // 19/5 = 3 and 4

        System.out.println("19 % 5 = " + 19 % 5);
        isNumberEven(7);
        isNumberOdd(6);
    }
    // 2 - true
    // 7 - odd number - result false
    public static boolean isNumberEven(int numberToCheck) {
        System.out.println("Number to check: " + numberToCheck);
        if ((numberToCheck % 2) == 0) {
            System.out.println("Even");
            return true;
        } else {
            System.out.println("Odd");
            return false;
        }
    }

    public static boolean isNumberOdd(int numberToCheck) {
        System.out.println("Number to check: " + numberToCheck);
        if ((numberToCheck % 2) != 0) {
            System.out.println("Even");
            return true;
        } else {
            System.out.println("Odd");
            return false;
        }

    }

}





















