package org.example;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("While loop");

        // while (booleanCondition) {}
        // increment operator
        // ++ - increase by one
        int number = 1;
        number = number + 1;
        number++; // the same as  number = number + 1;
        System.out.println("Number: " + number);

        // decrement operator
        // --
        number--; // the same as number = number - 1;

        // if condition is true, just repeat:)
        while (number > 0) {
            System.out.println("Current value of number: " + number);
            number--;
        }
        System.out.println("After the loop");
        System.out.println("Current value of number is: " + number);
        // number is 0 now
        while (number > 0) {
            System.out.println("Nothing....");
        }

    }
}