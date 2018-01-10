package com.company;

public class DebugFour4 {

    private static double DISCOUNT_RATE;

    public static void main(String args[])
    {
        final double DISCOUNT_RATE = 0.90;
        int price = 100;
        double price2 = 100.00;
        tenPercentOff(price, DISCOUNT_RATE);
        tenPercentOff((int) price2, DISCOUNT_RATE);
    }
    public static void tenPercentOff(int p)
    {
        double newPrice = p * DISCOUNT_RATE;
        System.out.println("Ten percent off" + p );
                System.out.println("  New price is " + newPrice);
    }
    public static void tenPercentOff(int price, double p)
    {
        double newPrice = DISCOUNT_RATE;
        System.out.println("Ten percent off " + p);
        System.out.println("  New price is " + newPrice);
    }
}
