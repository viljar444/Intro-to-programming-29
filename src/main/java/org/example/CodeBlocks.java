package org.example;

public class CodeBlocks {

    // main is function - feature
    public static void main(String[] args) {

        if (true) ; // empty instruction

        if (true) {
            System.out.println("first");
            System.out.println("second");
        }

        if (false) {
            System.out.println("third");
            System.out.println("third");
            System.out.println("third");
            System.out.println("third");
            System.out.println("third");
            System.out.println("third");
        }

        System.out.println("fourth");

        if (true) {
            System.out.println("Just true");
        }
    }
}