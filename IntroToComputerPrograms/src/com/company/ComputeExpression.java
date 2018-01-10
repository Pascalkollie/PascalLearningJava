package com.company;

public class ComputeExpression {

    public static void main(String[] args) {

        System.out.println("Compute expressions ");
        System.out.println((9.5 * 4.5) - (2.5 * 3) / (45.5 - 3.5));

        System.out.println("Summation of a series ");
        System.out.println(1 + 2 + 3 + 5 + 6 + 7 + 8 + 9);

        System.out.println("Approximate pi");
        System.out.println(4 * (1.0 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11)));

        System.out.println("Area of a circle is ");

        double perimeter = 2d;
        double radius = 5.5d;
        double pi = 3.14159;

        System.out.println();
        System.out.println("perimeter is " + (perimeter * radius * pi) + "  area is " + (radius * radius * pi));
        System.out.println();

        System.out.println("The area of a perimeter rectangle ");
        double weight = 4.5d;
        double height = 7.9d;
        System.out.println("The area of a rectangle with the wight of 4.5 and a height of  7.9 " + (weight * height));

        System.out.println();
        System.out.println("Convert kilometer to miles  ");

        double kilometers = 14.0;
        double miles = kilometers / 1.6;

        double rate = (45.5 * 60.0 + 30.0) / (60.0 * 60.0);
        double milesPerHour = miles / rate;

        System.out.println(milesPerHour);

        System.out.println("Population productions ");

        double birthRateInSeconds = 7.0;
        double deathRateInSeconds = 13.0;
        double newImmigrantInSeconds = 45.0;

        double currentPopulation = 312032486;
        double secondsInYears = 60 * 60 * 24 * 365;

        double numBirths = secondsInYears / birthRateInSeconds;
        double numDeaths = secondsInYears / deathRateInSeconds;
        double numImmigrants = secondsInYears / newImmigrantInSeconds;

        for (int i = 1; i <= 5; i++) {
            currentPopulation += numBirths + numImmigrants - numDeaths;
            System.out.println("Year " + i + " = " + (int) currentPopulation);
        }


        System.out.println();
        System.out.println("Average speed kilometers");


        double hours = 1;
        double minutes = 40;
        double seconds = 35;
        double distanceInMiles = 24;

        // Converting from miles to kilometers
        // Note: the book said 1.6, however 1.60934 is more accurate
        double distanceInKilometers = distanceInMiles * 1.60934;

        // Converting current time (hour, minutes, seconds) into total amount of minutes
        double timeInMinutes = hours * 60.0 + minutes + seconds / 60.0;

        // Calculating kilometers per hour
        // kph = 60 * distance traveled / minutes taken
        double kilometersPerHour = 60.0 * distanceInKilometers / timeInMinutes;

        System.out.println(kilometersPerHour);

        System.out.println();
        System.out.println("Solving equations ");

        double x = 3.4d;

        double y = 50.2d;

        System.out.println((x + y ));

    }

}
