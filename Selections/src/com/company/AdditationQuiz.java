package com.company;

import java.util.Scanner;

public class AdditationQuiz {

     public static void main (String[]args){

         int number1 = (int)(System.currentTimeMillis() % 100);
         int number2 = (int) (System.currentTimeMillis() / 4 % 404);

         // Create a Scanner

         Scanner input = new Scanner(System.in);
         System.out.print("What is " + number1 + " + " + number2 + " ?");

         int number = input.nextInt();

         System.out.println(number1 + " + " + number2 + " is " + " is " + ( number1 + number2 == number));
     }
}
