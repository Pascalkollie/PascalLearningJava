package com.company;

import java.util.Scanner;

public class Insurance {

     public static void main(String [] args){
         Scanner sc = new Scanner(System.in);

         int currentYear;
         int birthYear ;
         System.out.println("Enter current year: ");
         currentYear = sc.nextInt();
         System.out.println("Enter birth year: ");
         birthYear = sc.nextInt();

         int age = currentYear - birthYear;

         int premium = computePremium(currentYear, birthYear);

         System.out.println(" A " + age + " year old would pay premium amount of $ "
         + premium);


     }

     private  static int computePremium(int currentYear, int birthYear){

         int years = currentYear - birthYear;
         int decades = years /10;

          int premium = (decades + 15) * 20;

          return premium;


     }

}
