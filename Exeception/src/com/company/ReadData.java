package com.company;

import java.util.Scanner;

public class ReadData {

     public static void main (String [] args) throws Exception {
         // Create a instance of a file
         java.io.File file = new java.io.File("scores.txt");

         // Create a scanner for the file
         Scanner input = new Scanner(file);

         // Read data form a file

         while (input.hasNext()) {
             String firstName = input.next();
             String midleName = input.next();
             String lastName = input.next();
             int score = input.nextInt();
             System.out.println(firstName + " " + midleName + " " + lastName + " " + score);
         }
         input.close();
     }
}
