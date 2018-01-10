package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber;
        secretNumber = (int) (Math.random() * 5 + 1);


        int guess;

        System.out.print("Guess java secret number between 1 to 5 ");
        guess = sc.nextInt();
        System.out.println("Your guess is " + guess);

        do {
            System.out.println(" wrong guess try again ");
            System.out.println(" Guess java secret number between 1 to 5  ");
            guess = sc.nextInt();
            if (guess == secretNumber)
                System.out.println("Your guess is correct. Congratulations!");

        } while (guess != secretNumber ) ;

    }
}



