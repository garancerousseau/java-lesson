package com.company;

public class Lesson1 {


    public static void main(String[] args) {
        //int = 1, 2, 3, 4, 0, 659824089234
        //double = 1.1, 1.2. 2.4
        //float = 1.23456778
        //long = 12312391820398123

        //String = "Jack", "Garance"
        //char = 'j', 'g'


        //Below is a variable. It has the type of String and it's value is "Hello, world!" and it's name is helloWorld
        String helloWorld = "Hello, world";

        //We pass the variable named helloWorld to the method (function) print...
        print(helloWorld);

        //Here we pass the raw String "What's up" to the method print...
        print("What's up");

        //Below is an int variable. Since the method add() has the return type of int, we can store it's result here.
        int result = add(1, 2);

        //Then we can pass the result of adding 1 and 2, to the print method so we can see it in the console
        //when we run the program.
        print(result);

        String nahSon = "nah Son";
        print(nahSon);

    }

    //Below is the method called add. Ignore the static word for now. It has the return type of int and has
    //2 parameters, an int that we named a, and an int that we named b. It returns the value of a + the value of b.
    static int add(int a, int b) {
        return a + b;
    }

    //Below is the method called print. It has a void return type which means that even though the function does something,
    //it doesn't return any values back. It takes a String as a parameter that we've called theSentenceToPrint.
    //It then takes that String and prints it to the console so we can see it when we run the program.
    static void print(String theSentenceToPrint) {
        System.out.println(theSentenceToPrint);
    }

    static void print(int theNumberToPrint) {
        System.out.println(theNumberToPrint);
    }
}
