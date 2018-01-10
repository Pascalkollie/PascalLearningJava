package com.company;

import java.io.*;
public class Card {


        char suit;
        int value;

        public void setValue(char ch,int var)
        {
            suit=ch;
            value=var;
        }

        public void getValue(char ch,int var) {
            switch (ch) {
                case 'c':
                    System.out.println("The card chosen is:" + var + " of " + "clubs");
                    break;

                case 'd':
                    System.out.println("The card chosen is:" + var + " of " + "diamonds");
                    break;

                case 'h':
                    System.out.println("The card chosen is:" + var + " of " + "hearts");
                    break;

                case 's':
                    System.out.println("The card chosen is:" + var + " of " + "spades");
                    break;
            }
        }

        public static void main(String args[])throws IOException
        {
            Card ob1=new Card();
            Card ob2=new Card();
            char ch1='c';
            char ch2='s';
            final int CARDS_IN_SUIT = 13;
            int myValue1 = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
            int myValue2 = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
            ob1.getValue(ch1, myValue1);
            ob2.getValue(ch2, myValue2);
            ob1.setValue(ch1, myValue1);
            ob2.setValue(ch2, myValue2);
        }
    }
