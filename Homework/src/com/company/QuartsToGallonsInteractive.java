package com.company;

import java.util.Scanner;

public class QuartsToGallonsInteractive {

     public static void main (String [] args){
         Scanner inputs = new Scanner(System.in);

         // one quart is four cups
         final int ONE_QUART = 4;

         // Declare number of quarts

         int quarts;

         // Set a boolean repeat to true

         boolean repeat = true;

         while (repeat){
             System.out.println("Enter number of" + " quarts");

             try{
                 // prompt for number of quarts
                 quarts = Integer.parseInt( inputs.nextLine());

                 int gallons = quarts / ONE_QUART;

                 System.out.println( " for quarts " + quarts + " the number of gallons is " + gallons);
                 repeat = false;

             } catch (NumberFormatException ex){
                 System.out.println(ex.getCause());
             }
         }
     }
}
