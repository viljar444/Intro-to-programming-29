package org.example;

public class FunctionWithResult {

    public static void main(String[] args) {
        System.out.println("Play with functions with results");

        int multiplicationResult = multiplyThreeNumbers(1, 3, 9);

        System.out.println("Got a result: " + multiplicationResult);

        multiplyThreeNumbers(1, 1, 1);

        String finalString = createStringBasedOnNameAndAge(1, "John");
        System.out.println("Final string is: " + finalString);
    }

    public static int multiplyThreeNumbers(int first, int second, int third) {
        int result = first * second * third;
        System.out.println("heavy calculations :)");
        return result;
    }

    public static String createStringBasedOnNameAndAge(int age, String name) {
//        String result = "Hi " + name + ", you're " + age + " years old";
//        System.out.println("done");
//        return result;
        return "Hi " + name + ", you're " + age + " years old";
    }
}