package com.company;

import java.util.Scanner;

public class Percentage {

     public static void main (String [] args){

          Scanner sc = new Scanner (System.in);
          System.out.println("Enter percent of number ");
          double persent = sc.nextDouble();
          System.out.println("Enter number");
          double number = sc.nextDouble();
         System.out.println( computePersent(persent, number)+" %");

     }

      public static double  computePersent(double a, double b){
            double result = a % b;
            return  result;

      }
}
