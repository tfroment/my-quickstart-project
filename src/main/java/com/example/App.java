package com.example;

/**
 * Hello world!
 *
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