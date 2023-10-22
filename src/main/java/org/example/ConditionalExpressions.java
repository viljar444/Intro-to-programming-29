package org.example;

public class ConditionalExpressions {

    public static void main(String[] args) {
        System.out.println("Conditional expressions and operators");

        boolean condition = false;
        int age = 17;

        boolean isAdult = age >= 18;
        boolean isKid = age < 18;

        System.out.println("Is adult: " + isAdult);
        System.out.println("Is kid: " + isKid);

        boolean negationValue = !isAdult;
        System.out.println("negated value: " + negationValue);


    }
}