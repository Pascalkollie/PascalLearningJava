package com.company;

import java.io.IOException;
import java.util.Scanner;

public class TestApplication {

    public static void main (String [] args) throws IOException{
        Scanner sca = new Scanner(System.in);
        String fileInput = "CustomerRecords.txt";
        int option = -1;
        while(option != 999) {
            System.out.println();
            System.out.println("  Enter a option :");
            System.out.println("--------------------------------");
            System.out.println("1. Add a customer in the list.");
            System.out.println("2. Display the list.");
            System.out.println("3. Search by customer ID.");
            System.out.println("4. Search by customer by last name.");
            System.out.println("5. Search by customer balance.");
            System.out.println("6. Exit");

            option = sca.nextInt();
            sca.nextLine();
            switch (option) {
                case 1:
                    WriteCustomerList.writeFile(fileInput);
                    break;
                case 2:
                    DisplaySavedCustomerList.readFile(fileInput);
                    break;
                case 3:
                    DisplaySelectedCustomer.searchByIDnumber(fileInput);
                    break;
                case 4:
                    DisplaySelectedCustomersByName.searchByName(fileInput);
                    break;
                case 5:
                     DiplaySelectedCustomersByBalanace.surchByBalance(fileInput);
                    break;
                case 6:
                    System.out.println(" Thanks for using Pascal Aldave Kollie application ");
                    option += 999;
                    break;
                default:
                    System.out.println("Please enter correct choice.");
                    break;
            }
        }
    }
}
