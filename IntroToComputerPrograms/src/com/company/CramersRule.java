package com.company;

import java.util.Scanner;

public class CramersRule {

     public static void main (String [] args){

         double a,b,c,d,e,f, n1, n2, denominator, x, y;

         Scanner sc = new Scanner(System.in);
         System.out.println("THe problem solve 2x2 linear equation"+"\n The following equations and display");

         //Read inputs

         a = sc.nextDouble();
         b = sc.nextDouble();
         c = sc.nextDouble();
         d = sc.nextDouble();
         e = sc.nextDouble();
         f = sc.nextDouble();

         n1 = ((e * d) - (b * f));
         n2 = ((a * f) - (e * c));

         denominator = ((a * d) -(b * c));

         // calculate x and y

         x = n1 / denominator;
         y = n2 / denominator;

         if (denominator == 0) {

             System.out.println("\n The equation has no solution");
         }
          else {
             System.out.println("X is " + x + " and y is " + y);
         }
     }
}
