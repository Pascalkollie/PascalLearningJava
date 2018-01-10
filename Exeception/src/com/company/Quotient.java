package com.company;

import java.util.Scanner;

public class Quotient {


// Catching ArithmeticExeception

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Prompt the user to enter two integers

        try {
            System.out.println("Enter integers");
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
