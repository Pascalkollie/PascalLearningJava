package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMatchExceptionDemo {

     public static void main (String [] args) {
         Scanner input = new Scanner(System.in);
         boolean continueInput = true;

         do {
             try {

                 System.out.print("Enter an integer: ");
                 int number = input.nextInt();

                 // Display the result
                 System.out.println(" The number enter is " + number);
                 continueInput = false;

             } catch (InputMismatchException ex) {
                 System.out.println("Try again. ( " + " Incorrect input an integer is required) ");
                 input.nextLine();  // Discard input
             }
         }
         while (continueInput) ;

     }
}
