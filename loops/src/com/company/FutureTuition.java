package com.company;

import java.text.NumberFormat;

public class FutureTuition {

     public static void main (String [] args) {

          double tuition = 10000;
          int year = 0;

          while (tuition < 20000){
              tuition = tuition * 1.07;
              year ++;
          }
         System.out.println("Tuition will be double in " + year + " years ");
         NumberFormat format = NumberFormat.getCurrencyInstance();
         System.out.printf("Tuition will be " + format.format(tuition));
     }
}
