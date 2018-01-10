package com.company;

import java.util.Scanner;

public class Palindrone {



    public static void main (String [] args) {

        /**
         * Write an application that determines whether a phrase entered by the user is a
         palindrome. A palindrome is a phrase that reads the same backward and forward
         without regarding capitalization or punctuation. For example, “Dot saw I was Tod”,
         “Was it a car or a cat I saw?”, and “Madam, I’m Adam” are palindromes. Save the file
         as Palindrome.java.
         */



                System.out.print("Enter the String:");
                Scanner sc=new Scanner(System.in);
                isPalindrome(sc.nextLine());
            }

                public static  void isPalindrome(String str)
                {
                String s = str.toLowerCase().replaceAll("\\W", "");
                int j=0;
                int k = s.length() - 1;

                while(j < s.length() / 2)
                {
                    if (s.charAt(j++) != s.charAt(k--))
                    {

                        System.out.println("* This is not a Palindrome *");
                        System.exit(0);
                    }
                }

                System.out.println("* This is a Palindrome *");

            }
        }
