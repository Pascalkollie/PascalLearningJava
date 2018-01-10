package com.company;

import java.util.Scanner;

public class SqrtExceotion {

     public static void main (String [] args){

         // create a scanner object

         Scanner input = new Scanner(System.in);

          // Create a repeat statment
         boolean repeat = true;

         while (repeat){
         try {

             // prompt the user to enter a number
             System.out.println("Take the square root of a number ");
             int number = (int) Math.sqrt(input.nextInt());

             System.out.println(" The square root is " + number);

          }catch (ArithmeticException ex) {
             System.out.println(ex.getMessage() + " you can not square zero");
         }
         }
     }
}
