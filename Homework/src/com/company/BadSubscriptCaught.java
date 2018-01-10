package com.company;

import java.util.Scanner;

public class BadSubscriptCaught {

        public static void main(String[] args) {


        Scanner input = new Scanner(System.in); // Create a scanner object

           // initialize array name to 10 value

        String[] name = {"Pascal", "Kato", "Helena", "Thomas", "Fahim", "Avery", "Christ", "James", "Lewis", "Bob"};


          // try and catch any array out of bounds exceptions
            try {
                int number = 0;
                System.out.println("Enter a number lower then 9 to get name in index position  ");
                number = input.nextInt();
                System.out.println("At index " + number  + " the name is " + name[number]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(ex.getMessage() + " is out of bounds enter number ( <= 9 )");
            }
        }
    }

