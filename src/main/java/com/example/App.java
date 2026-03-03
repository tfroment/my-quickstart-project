package com.example;

/**
 * The `App.java` file contains a Java class named `App`.
 *
 * Here's what this application does:
 * - The `main` method is the entry point of the application. It simply prints "Hello World!" to the console.
 * - The `getGreeting` method returns the string "Hello World!".
 * - The `squareRoot` method calculates the square root of a given number. It checks if the number is negative
 *   and throws an `IllegalArgumentException` if it is, as the square root of a negative number
 *   is not defined in the domain of real numbers.
 *
 * In summary, this is a basic Java application that displays a welcome message
 * and provides a utility function to calculate the square root of a number.
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public String getGreeting() {
        return "Hello World!";
    }
 //   public String myMethodTest() {
 //   }
    /**
     * Calculate the square root of a number.
     * @param number The number to calculate the square root of.
     * @return The square root of the number.
     * @throws IllegalArgumentException If the number is negative.
     */
    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(number);
    }
}