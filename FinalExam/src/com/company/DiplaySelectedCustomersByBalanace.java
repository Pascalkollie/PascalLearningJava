package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DiplaySelectedCustomersByBalanace {


    public static void surchByBalance(String fileInput) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Costumer balance to search: ");
        String balance = sc.next();

        sc = new Scanner(new File(fileInput));
        String line;
        String[] textIndex;
        int count = 0;
        System.out.println("Records in File matching with balance: ");
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            textIndex = line.split(" ");
            if (textIndex[3].equals(balance)) {
                count++;

                System.out.println(count + ".");
                System.out.println("Costumer ID Number:" + textIndex[0]);
                System.out.println("Costumer First Name:" + textIndex[1]);
                System.out.println("Costumer Last Name:" + textIndex[2]);
                System.out.println(" Costumer Balance owned:" + textIndex[3]);
                System.out.println();
                System.out.println();
            }
        }
    }
}
