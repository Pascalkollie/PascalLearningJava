package com.company;

import java.util.Scanner;

public class CIrcle {

     public static void main (String [] args) {

         boolean run =false;
         do {
               try{
                   radious();
               }catch (Exception e){
                   System.out.println(e.getMessage());
               }

               run = true;


         } while (run);

     }

     public static void radious (){
         Scanner input = new Scanner(System.in);
         System.out.println("Enter a table size .. ");
         int r = input.nextInt();
         System.out.println("              Multiplication table ");

         System.out.print("    ");
         for (int i = 1; i <= r; i++)
             System.out.print("   " + i);
         System.out.println("\n--------------------------------------------------------------");
         for (int j = 1; j <= r; j++) {
             System.out.print(j + " | ");
             for (int i = 1; i <= r; i++) {
                 System.out.printf("%4d", i * j);
             }

             System.out.println();

         }
     }
}
