package com.company;

import java.util.Scanner;

public class TestSandWich {

     public static void main (String [] args){

         SandWich firstSandWich = new SandWich();
         firstSandWich = values(firstSandWich);
         showValues(firstSandWich);

     }

      public static SandWich values (SandWich values ){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter ingredient ");
          values.setIngredient(sc.nextLine());

          System.out.println("Enter bread type");
          values.setBreadType(sc.nextLine());

          System.out.println("Enter price");
          values.setPrice(sc.nextDouble());

          return values;
      }

      public static void showValues (SandWich values){
          System.out.println("The ingredient is " + values.getIngredient());
          System.out.println("The bread type is " + values.getBreadType());
          System.out.println("The price is " + values.getPrice());

      }
}
