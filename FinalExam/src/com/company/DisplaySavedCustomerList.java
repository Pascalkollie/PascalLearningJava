package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisplaySavedCustomerList {


    public static void readFile(String fileInput) throws FileNotFoundException {

        Scanner input = new Scanner(new File(fileInput));
        String line;
        String[] textIndex;
        int count = 0;
        System.out.println("Records in File: ");
        while(input.hasNextLine()) {
            count++;
            line = input.nextLine();
   
            textIndex = line.split(" ");
            System.out.println(count+".");
            System.out.println("Costumer ID Number:"+textIndex[0]);
            System.out.println("Costumer First Name:"+textIndex[1]);
            System.out.println("Costumer Last Name:"+textIndex[2]);
            System.out.println("Costumer Balance owned:"+textIndex[3]);
            System.out.println();
            System.out.println();
        }
            if(count == 0) {
            System.out.println("No records in file.");
        }

    }
}





