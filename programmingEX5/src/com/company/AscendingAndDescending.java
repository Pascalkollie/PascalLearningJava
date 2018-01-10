package com.company;

import java.util.Scanner;

public class AscendingAndDescending {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter number value");
        int x = sc.nextInt();
        System.out.println("Enter number value");
        int y = sc.nextInt();
        System.out.println("Enter number value");
        int z = sc.nextInt();

        if (x < y && y < z) {

            if(x <=z)
            System.out.println("Ascending order:" + z + "" + x + "" + y);
            System.out.println("Descending order:" + y + "" + x + "" + z);
        } else {
            System.out.println("Ascending order:" + z + "" + y + "" + x);
            System.out.println("Descending order:" + x + "" + y + "" + z);
        }
    }


}
