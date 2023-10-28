package org.example.time;

import org.example.HomeworkCalculator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.lang.*;

public class TimeExample {
    public static void main(String[] args) {
        System.out.println("Time examples");
        int number = 0;

        // name of variable is called reference
        String myName = "Mariusz P.";
        System.out.println("My name has " + myName.length() + " letters");
        System.out.println("name with lower cases: " + myName.toLowerCase());

        String mart = "Mart";
        String diana = "Diana";
        System.out.println("mart's name length: " + mart.length());
        System.out.println("diana's name length: " + diana.length());
//        String.length();

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current time is: " + currentTime);

        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date is: " + currentDate);
        int currentYear = currentDate.getYear();
        System.out.println("currentYear = " + currentYear);
//        LocalDate.getYear();

        LocalDate somePreviousDate = LocalDate.of(1800, 1, 7);
        System.out.println("previous date: " + somePreviousDate);
        int someYear = somePreviousDate.getYear();
        System.out.println("some year: " + + someYear);

        HomeworkCalculator.add(1, 5);
    }
}