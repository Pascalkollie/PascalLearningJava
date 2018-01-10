package com.company;

import java.util.Scanner;

public class AssingVolunteer3 {

     public static void main(String [] args) {
         Scanner sc = new Scanner(System.in);

         String message;
         int donationType;
         String volunteer;
         final int CLOTHING_CODE = 1;
         final int OTHER_CODE = 2;
         final String CLOTHING_PRICER = "Regina";
         final String OTHER_PRICER = "Marco";

         System.out.println("What type of donation is this?");
         System.out.print("Enter " + CLOTHING_CODE + " for clothing, " +
                 OTHER_CODE + " for anything else… ");
         donationType = sc.nextInt();

         if(donationType == CLOTHING_CODE)
         {
             volunteer = CLOTHING_PRICER;
             message = "a clothing donation";
         }
         else
         {
             volunteer = OTHER_PRICER;
             message = "a non-clothing donation";
         }

         System.out.println(CLOTHING_CODE);
         System.out.println("This is " + message);
         System.out.println("You entered " + donationType);
         System.out.println("The volunteer who will price this item is " +
                 volunteer);

          }
        }
