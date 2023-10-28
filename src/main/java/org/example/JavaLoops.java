package org.example;

public class JavaLoops {
    public static void main(String[] args) {
        System.out.println("Java has 3 types of loops");
        System.out.println("Most popular is for loop");

        // 10 repetitions of for loop
        for (int number = 10; // init part - executed just once
             number > 0; // condition part - executed before every execution of loop
             number--  // control steering variable - last instruction of the body
        ) {
            System.out.println("Current value of number is: " + number);
        }
//        number--; // it belongs only to for loop
        int number = 11;
        // for is the same as this while loop
        int control = 10;
        while (control > 0) {
            System.out.println("Current value of number is: " + control);
            control--;
        }
        System.out.println("Outside while control is: " + control);

        // infinite for loop
//        for(;;) {
//
//        }

        for (int i = 100; i > 0; i--) {
            System.out.println("Current value of i: " + i);
            if (i == 90) {
                // exit the loop
                break;
            }
        }

        System.out.println("Printing stars");
        // *
        // **
        // ***
        // print 10 lines first
        String stars = "*";
        for (int i = 0; i < 11; i++) {
            System.out.println(stars);
            stars = stars + "*";
        }
    }
}