package com.company;

import java.util.Scanner;

public class BookStoreCredit {

    public static void main(String[] args) {


        System.out.println("Your book store credit for "+ name()+ " is " + credit(getGradePointAvarage()));


    }

    public static double getGradePointAvarage() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your G.P.A");
        double myGrade = sc.nextDouble();
        return myGrade;
    }


    public static double credit(double a) {


        double myCredit = a;
        System.out.println(a * 10);
        return myCredit;
    }

    public static String name(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name ");
        String name = sc.nextLine();

        return name;
    }


}
