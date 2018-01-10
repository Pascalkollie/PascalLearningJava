package com.company;

public class TwoDice {

     public static void main(String [] args){

    Die die1=new Die();
    Die die2=new Die();
    int d1,d2;
    d1=die1.getValue();
    d2=die2.getValue();
    System.out.println("Die 1 value: "+d1);
   System.out.println("Die 2 value: "+d2);
  }

}
