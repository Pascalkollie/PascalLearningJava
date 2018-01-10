package com.company;

import javax.swing.*;

public class Lottery {


        public static void main(String[] args) {


            int g1 = 0; //user's input
            int g2 = 0;
            int g3 = 0;


            int num1; //random numbers
            int num2;
            int num3;
            int totalMatch = 0;

            //Match
            boolean match1 = false, match2 = false, match3 = false;

            //get the input data from the user
            g1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Your First Number"));
            g2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Second Number"));
            g3 = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Third Number"));


            num1 = ((int) (Math.random() * 100) % 9 + 0); // randomly picks a number from 0 to 9
            num2 = ((int) (Math.random() * 100) % 9 + 0); // randomly picks a number from 0 to 9
            num3 = ((int) (Math.random() * 100) % 9 + 0); // randomly picks a number from 0 to 9

            //show the user inputs
            JOptionPane.showMessageDialog(null, "Your 3 Numbers are: " + g1 + "," + g2 + "," + g3);
            JOptionPane.showMessageDialog(null, "The Lottery Numbers Are: " + num1 + "," + num2 + "," + num3);

            if (num1 == g1)
            {
                match1 = true;
            }
            else if(num1 == g2)
            {
                match1 = true;
            }
            else if(num1 == g3)
            {
                match1 = true;
            }
            if(match1)
            {
                totalMatch+=1;
            }
            if (num2 == g1)
            {
                match2 =true ;
            }
            else if (num2 == g2)
            {
                match2 =true ;
            }
            else if (num2 == g3)
                match2 = true;
            if(match2)
            {
                totalMatch+=1;
            }
            if (num3 == g1)
            {
                match3 = true;
            }
            else if (num3 == g2)
                match3 = true;
            else if (num3 == g3)
            {
                match3 = true ;
            }
            if(match3)
            {
                totalMatch+=1;
            }

            if(totalMatch>0)
                JOptionPane.showMessageDialog(null,"Total matches= " + totalMatch+"\n"+"You won $"+(totalMatch*3));
            else
                JOptionPane.showMessageDialog(null,"No matches ");
        }

    }
