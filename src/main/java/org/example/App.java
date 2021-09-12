/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    // Prompts user to enter three numbers and prints the largest.
    // If all numbers are not different then exit program.
    public static void main( String[] args )
    {
        int numOne, numTwo, numThree;

        System.out.println("Enter the first number: ");
        Scanner inputNumOne = new Scanner(System.in);
        numOne = inputNumOne.nextInt();

        System.out.println("Enter the second number: ");
        Scanner inputNumTwo = new Scanner(System.in);
        numTwo = inputNumTwo.nextInt();

        System.out.println("Enter the third number: ");
        Scanner inputNumThree = new Scanner(System.in);
        numThree = inputNumThree.nextInt();

        if ((numOne == numTwo) || (numOne == numThree) || (numTwo == numThree))
        {
            System.out.println("Please enter three different values");
            System.exit(0);
        }
        else if ((numOne > numTwo) && (numOne > numThree))
        {
            System.out.println("The largest number is " + numOne + ".");
        }
        else if ((numTwo > numOne) && (numTwo > numThree))
        {
            System.out.println("The largest number is " + numTwo + ".");
        }
        else
        {
            System.out.println("The largest number is " + numThree + ".");
        }
    }
}
