package com.company;



public class numberrsDemo {

     public static void main (String [] args){

         int num1 = 10;
         int num2 = 4;
         System.out.println("Twice of (10) " + displayTwiceNumber(num1, num1));

          System.out.println(" 10  plus 5  is " + displayNumberPlusFive(num1));

         System.out.println("4  plus 5 " + displayNumberPlusFive(num2) );

         System.out.println("Number square of 10  is " +    displayNumberSquare(num1) );

       }

     public static int displayTwiceNumber(int a, int b){
         int result = a + b;
         return result;
     }

     public static int displayNumberPlusFive(int a){
         int result = a + 5;
         return result;
     }

     public static double displayNumberSquare(int number){


              double result = Math.pow(number, 2);
               return result;
     }


}
