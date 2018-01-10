package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class CondoSales {

    public static void main (String [] args) {
        /**
         *  Write an application for the Summer dale Condo Sales office; the program determines the price
         *  of a condominium. Ask the user to choose 1 for park view, 2 for golf course view, or 3 for lake view.
         *  The output is the name chosen view as well as the price of the condo. Park view condo. Park view condos are $150.000
         *  condos with golf course view are $170.00, and condo with lake view are $210,000. if the user enters an invalid code, set the
         *  price to 0.
         */

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        int view;
        double price;
        Scanner in = new Scanner(System.in);
        System.out.println("Select condos View\n");
        System.out.print("1)Park view\n2)Golf course view\n3)Lake view \n");
        view = in.nextInt();
        in.nextLine();


        switch (view) {
            case 1:
                price = 150000;

                System.out.println("You Have Selected Park View\nPrice is " + nf.format(price));
                break;
            case 2:
                price = 170000;
                System.out.println("You Have Selected Golf Course View\nPrice is " + nf.format(price));
                break;
            case 3:
                price = 210000;
                System.out.println("You Have Selected Lake View\nPrice is " + nf.format(price));
                break;
            default:
                price = 0;
                System.out.println("Invalid \nprice is " + price);

        }

    }

}
