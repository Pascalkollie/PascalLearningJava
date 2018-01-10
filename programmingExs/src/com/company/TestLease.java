package com.company;

import java.util.Scanner;

public class TestLease {

    public static void main(String[] args)
    {
        Lease firstLease = new Lease();
        Lease secondLease = new Lease();
        Lease thirdLease = new Lease();
        Lease fourthLease = new Lease();

        firstLease = getdata(firstLease);
        secondLease = getdata(secondLease);
        thirdLease = getdata(thirdLease);
        fourthLease = getdata(fourthLease);

        showValues(firstLease);
        firstLease.addPetFee();
        showValues(firstLease);
        showValues(secondLease);
        showValues(thirdLease);
        showValues(fourthLease);

    }
    public static Lease getdata(Lease lease)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter name >> ");
        lease.setname(keyboard.nextLine());


        System.out.print("Enter apartment number >> ");
        lease.setapartmentNumber(keyboard.nextDouble());

        System.out.print("Enter rent >> ");
        lease.setrent(keyboard.nextDouble());

        System.out.print("Enter term >> ");
        lease.setterm(keyboard.nextDouble());

        return lease;

    }
    public static void showValues(Lease lease)
    {
        System.out.println("Lease name " + lease.getname());
        System.out.println("Lease apartment number " + lease.getapartmentNumber());
        System.out.println("Lease rent " + lease.getrent());
        System.out.println("Lease term " + lease.getterm());
    }

}

