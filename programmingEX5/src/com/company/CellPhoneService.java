package com.company;

import java.util.Random;
import java.util.Scanner;

public class CellPhoneService {

     public static void main (String [] args){
         Scanner sc = new Scanner(System.in);

         final int MAX_MIN;
         final int TEXT ;
         final int GIGA_BYTES;

         System.out.println("Enter maximum monthly talk minutes used");
         MAX_MIN = sc.nextInt();
         System.out.println("Amount of text send");
         TEXT = sc.nextInt();
         System.out.println("Amount of gigabytes use");
         GIGA_BYTES = sc.nextInt();

         if( MAX_MIN < 500 && TEXT <=0 && GIGA_BYTES ==0){
             System.out.println("Plan A at $49 per month");
         }
         if (MAX_MIN < 50 && TEXT > 0 && GIGA_BYTES == 0){
             System.out.println("Plan B at $55 per month");
         }

         if ( MAX_MIN >= 500 && TEXT <= 100 && GIGA_BYTES ==0){
             System.out.println("Plan C  at $61 per month");
         }

          if ( MAX_MIN >= 500 && TEXT >= 100 && GIGA_BYTES <=2){
             System.out.println("Plan C  at $70 per month");
         }
         if ( MAX_MIN >= 500 && TEXT >=100 && GIGA_BYTES  >2 && GIGA_BYTES == 1){
             System.out.println("Plan E  at $79 per month");
         }

          if(MAX_MIN >= 500 && TEXT >= 100 && GIGA_BYTES > 2 && GIGA_BYTES == 1){
              System.out.println("Plan F at $87 per month");
          }
     }
}
