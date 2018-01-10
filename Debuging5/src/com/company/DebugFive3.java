package com.company;

import java.util.Scanner;

public class DebugFive3 {

    public static void main(String args[]){

        int item;
        String output;
        final int LOW = 11111;
        final int HIGH = 999;
        final int CUTOFF = 500;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter item number");
        item = input.nextInt();

        if(item <= LOW)
            output = "Item number too low";
        else if(item >= CUTOFF)
        output = "Item number too High";
        else if(item <= HIGH)
        output = "Valid - in Automotive Department";
          else
        output = "Valid - Item in Housewares Department";
        System.out.println(output);
   }

}
