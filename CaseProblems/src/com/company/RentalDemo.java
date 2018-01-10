package com.company;

import java.util.Scanner;

public class RentalDemo {
    public static void main(String[] args) {
//object 1 with default parameter values
        Rental r1=new Rental();
//to take user input
        Scanner s=new Scanner(System.in);
        String contact_number;
        int number_mins;
        System.out.println("Enter the contract number");
        contact_number=s.next();
        System.out.println("Enter the number of minutes");
        number_mins=s.nextInt();
//object 2 with user defined parameter values
        Rental r2=new Rental(contact_number, number_mins);
//prints r1 data
        System.out.println(r1.toString());
//prints r2 data
        System.out.println(r2.toString());
    }

}

