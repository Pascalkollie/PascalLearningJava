package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class WriteCustomerList {

      // Method for writhing files
    public static void writeFile(String fileInput) throws IOException {
        // Scanner object
        Scanner input = new Scanner(System.in);

        File fil = new File(fileInput);
        // Create a file
        PrintWriter output = new PrintWriter(new FileWriter(fil, true));

        // Formatted output to the file
        System.out.print("Enter customer ID number: ");
        output.write(input.next());
        System.out.print("Enter costumer First Name:");
        output.write(" " + input.next());
        System.out.print("Enter costumer Last Name:");
        output.write(" " + input.next());
        System.out.print("Enter costumer Balance owned:");
        output.write(" " + input.next() + "\n");

        // Close file
        output.close();
    }


}

