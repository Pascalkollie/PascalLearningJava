package com.company;

import java.util.Scanner;

public class craftPricing {

     public static void main (String [] args){

         Scanner sc = new Scanner(System.in);

          String productName;
          double materialsCost;
          double hoursWorked;

         System.out.println("Enter product name: ");
         productName = sc.nextLine();
         System.out.println("Enter cost of materials: ");
         materialsCost = sc.nextDouble();
         System.out.println("Enter hours worked ");
         hoursWorked = sc.nextDouble();

        double retailPricing = calculateRatailPrice( materialsCost, hoursWorked );
         System.out.println( " The name of product is " + productName + " the product will cost " + retailPricing + "$");




     }

     private static double calculateRatailPrice( double materialsCost, double hoursWorked){
        int shapping = 7;
        double ratialPricing = materialsCost + 12 * hoursWorked + shapping ;
        return ratialPricing;
     }
}
