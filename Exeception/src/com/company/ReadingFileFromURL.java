package com.company;

import java.util.Scanner;

public class ReadingFileFromURL {
     public static void main (String [] args){
         System.out.println("Enter a URl: "); // Enter URL
         String URLString  = new Scanner(System.in).next();

         try{
           java.net.URL url = new java.net.URL(URLString); // Create a URL object
             int count = 0;
            Scanner input = new Scanner(url.openStream());  // Crate a Scanner object more to read ? read line
            while (input.hasNext()){
                String line = input.nextLine();
                count += line.length();
            }

            System.out.println("The file size is " + count + " characters");
         } catch (java.net.MalformedURLException ex){
             System.out.println("Invalid URL");
         }

         catch (java.io.IOException ex){
             System.out.println("I/O errors: no such file");
         }
     }

}
