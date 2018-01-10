package com.company;

import java.util.Scanner;

public class TestBooleanOperators {

     public static void main (String [] args){
         Scanner input = new Scanner(System.in);

         System.out.print("Enter number");
         int number = input.nextInt();
         // and operator
         if ( number % 2 == 0 && number % 3 == 0){
             System.out.println("Is divisible by 2 and 3. ");
         }
         // or operator
         if (number % 2 == 0 || number % 3 == 0){
             System.out.println("Is divisible by 2 and 3. ");
         }

         if (number % 2 ==0 ^ number % 3 == 0){
             System.out.println("Is divisible by 2 or 3, but not both. ");
         }
     }
}
