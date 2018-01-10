package com.company;

import java.util.Scanner;

public class ComputingTax {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        // Prompt for filing status

        System.out.println("Enter filing status \nEnter 0 for single filers\nEnter 1 for married filing jointly\n" +
                "Enter 2 for married filing separately\nEnter 3 for Tax for head of household");
        int status = input.nextInt();

        // Enter taxable income
        System.out.println("Enter taxable income");
        double income = input.nextDouble();

        double tax = 0;


        if(status == 0 ){
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8530) * 0.15;
            else if (income <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            else if (income <= 171500)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
        }
        else if (status == 1){


        }
        else if (status == 2){

        }
        else if (status == 3){

        }

        else {
            System.out.println("Wrong status ");
        }
    }
}
