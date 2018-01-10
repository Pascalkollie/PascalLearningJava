package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisplaySelectedCustomer {

    public static void searchByIDnumber(String fileInput) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Costumer ID number: ");
        String idNumber = sc.next();

        sc = new Scanner(new File(fileInput));
        String line;
        String[] textIndex;
        int count = 0;
        System.out.println("Records in File matching with Customer ID number: ");
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            textIndex = line.split(" ");
            try {
                if (textIndex[0].equals(idNumber)) {
                    count++;
                    System.out.println(count + ".");
                    System.out.println("Costumer ID Number:" + textIndex[0]);
                    System.out.println("Costumer First Name:" + textIndex[1]);
                    System.out.println("Costumer Last Name:" + textIndex[2]);
                    System.out.println("Costumer Balance owned:" + textIndex[3]);
                    System.out.println();
                    System.out.println();
                }
              } catch (IndexOutOfBoundsException ex) {
                System.out.println(ex.getMessage());
               }

            if (count == 0) {
                System.out.println("No records in file matching with the customer ID number.");
            }

        }
    }
}
