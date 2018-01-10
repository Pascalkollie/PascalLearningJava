package com.company;

import javax.swing.*;
import java.util.Scanner;

public class DebugFive4 {

     public  static void main (String [] args) {


         int one, two, three = 0, four;

         String str, output;

         str = JOptionPane.showInputDialog(null, "Enter an integer");
         one = Integer.parseInt(str);
         str = JOptionPane.showInputDialog(null, "Enter an integer");
         two = Integer.parseInt(str);
         str = JOptionPane.showInputDialog(null, "Enter an integer");
         two = Integer.parseInt(str);
         str = JOptionPane.showInputDialog(null, "Enter an integer");
         four = Integer.parseInt(str);

         if (one > two && one >= three && one < four)
             output = "Highest is " + one;
         else if (two > one || two > three && two > four)
             output = "Highest is " + two;
         else if (three > one && three > two || three == four)
             output = "Highest is " + three;
         else
             output = "Highest is " + three;
         JOptionPane.showMessageDialog(null, output);

     }
}

