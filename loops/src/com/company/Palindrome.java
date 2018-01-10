package com.company;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String text = input.nextLine();


         int low = 0;
         int high = text.length() - 1;

          boolean isPalindrome = true;
         while (low < high){
             if(text.charAt(low) != text.charAt(high)){
                 isPalindrome = false;
                 break;
             }

             low ++;
             high --;
         }

         if(isPalindrome)
             System.out.println(text + " is a palindrome");
         else
             System.out.println(text + " is not a palindrome ");
    }
}
