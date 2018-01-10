package com.company;

import java.util.Scanner;

public class metricConversion {

     public static void main (String [] args){

         Scanner sc = new Scanner(System.in);

         int number;
         System.out.println("Enter a value: ");
         number = sc.nextInt();
         convertToCM(number);
         convertToGallons(number);


     }

     private static void convertToCM(int inches){

             final double INCH = 2.54;
             Double cms = inches * INCH;
             System.out.println(inches + " inches is " +
                     "equal to "+cms+"cm.");


     }
          private static void convertToGallons(int gallons){

               final double GALLON = 3.7825;
               double literes = gallons * GALLON;
              System.out.println( gallons + " gallons is equal to" +
                      " " +literes+ " liters.");
          }
}
