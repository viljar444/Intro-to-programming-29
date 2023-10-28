package org.example;

public class JavaTypes {

    public static void main(String[] args) {
        System.out.println("Java types example");
        System.out.println("Numbers first");

        // variable - place for storing some content
        // has type and value
        // int - integer number
        // age - name of variable
        int age;
        age = 18;
        System.out.println("Current age is: " + age);

        age = 20;
        System.out.println("Current age is: " + age);
        age = 25;
        System.out.println("Current age is: " + age);
        int age2 = 19;
        int age3 = -5;
        System.out.println("Current age3 is: " + age3);

        int age4 = 4;

        // double used for floating numbers
        double age5 = 4.5;
        System.out.println("Age5 is: " + age5);

//        int class = 5;

        System.out.println("Let's meet numbers type");
        System.out.println("int type");
        System.out.println("Smallest int is: " + Integer.MIN_VALUE);
        System.out.println("Biggest int is: " + Integer.MAX_VALUE);

        System.out.println();

        System.out.println("long type");
        long longAge = 5;
        System.out.println("Smallest long is: " + Long.MIN_VALUE);
        System.out.println("Biggest long is: " + Long.MAX_VALUE);

        System.out.println();

        System.out.println("byte type");
        byte byteAge = 5;
        System.out.println("Smallest byte is: " + Byte.MIN_VALUE);
        System.out.println("Biggest byte is: " + Byte.MAX_VALUE);

        System.out.println();

        System.out.println("short type");
        short shortAge = 5;
        System.out.println("Smallest short is: " + Short.MIN_VALUE);
        System.out.println("Biggest short is: " + Short.MAX_VALUE);

        System.out.println();

        System.out.println("double type");
        double doubleAge = 1.5;
        System.out.println("Smallest double is: " + Double.MIN_VALUE);
        System.out.println("Biggest double is: " + Double.MAX_VALUE);

        System.out.println();

        System.out.println("float type");
        float floatAge = 1.5f;
        System.out.println("Smallest float is: " + Float.MIN_VALUE);
        System.out.println("Biggest float is: " + Float.MAX_VALUE);

        System.out.println();

        System.out.println("char type");
        char singleLetter = 'a'; // "ddd"
        char aLatter = 97; // index of 'a' letter from table
        System.out.println("A letter: " + singleLetter);
        System.out.println("A letter: " + aLatter);

        System.out.println();

        System.out.println("boolean type");
        // true or false
        boolean trueValue = true;
        boolean falseValue = false;

        System.out.println("trueValue: " + trueValue);
        System.out.println("falseValue: " + falseValue);
    }
}