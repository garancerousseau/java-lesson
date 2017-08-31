package com.company;

public class Lesson1 {


    public static void main(String[] args) {
        //int = 1, 2, 3, 4, 0, 659824089234
        //double = 1.1, 1.2. 2.4
        //float = 1.23456778
        //long = 12312391820398123

        //String = "Jack", "Garance"
        //char = 'j', 'g'

        String helloWorld = "Hello, world";
        print(helloWorld);
        print("What's up");

        int result = add(1, 2);
        print(result);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static void print(String theSentenceToPrint) {
        System.out.println(theSentenceToPrint);
    }

    static void print(int theNumberToPrint) {
        System.out.println(theNumberToPrint);
    }
}
