package com.company;

import java.util.Scanner;

public class PrintCalender {
    /** Main method */
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a year
        System.out.print("Enter a full year (e.g. , 2012) : ");
        int year = input.nextInt();

        //prompt the user to enter month
        System.out.print("Enter  month as a number between 1 and 12: ");
        int month = input.nextInt();



        //Print calender for month in a year
        printMonth(year, month);

    }
    /** Print the calender for a month in a year */
    public static void printMonth(int year, int month){
      printMonthTitle(year, month);

      // Print the body of the calender
        printMonthBody(year, month);


    }

    public static void printMonthTitle(int year, int month){
        System.out.println("            " + getMonthName(month)
        + " " + year );
        System.out.println("-----------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

    }

    public static String getMonthName(int month){
        String monthName = " ";
        switch(month){
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June";  break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
            default:
                System.out.println(" The are only 12 month on a calender " );
        }

        return monthName;
    }

    public static void printMonthBody (int year, int month){
        // Get start day of the week for the first date in the month

        int startDay = getSartDay(year, month);

        // Get number of days it the month
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        // Pad space before the first day of the month
        int i = 0;
        for(i = 0; i < startDay; i++)
            System.out.print("   ");

        for(i = 1; i <= numberOfDaysInMonth; i++){
            System.out.printf("%4d", i);

            if((i + startDay) % 7 == 0 )
                System.out.println();

        }

        System.out.println();
    }
    /** Get the start day of the month/ 1/year */
    public static int getSartDay(int year, int month){
        final int START_DAY_FOR_JAN_1_1800 = 3;
        //Get the total number of days from 1/1/1800 to mont /1/year

        int totalNumberOfDays = getTotalNumberOfDays(year, month);

        //Return the start day fir month/1/year
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    public static int getTotalNumberOfDays(int year, int month){
        int total = 0;

        // Get the total days from 1800 to 1/1/year

        for(int i = 1800; i < year; i++)
            if(isLeapYear(i))
                total = total + 366;
        else
            total = total = 365;

        // Add days from jan to the month prior to the calender month
        for(int i = 1; i < month; i++)
            total = total + getNumberOfDaysInMonth(year, i);
         return  total;
    }

    public static int getNumberOfDaysInMonth(int year, int month){

        if (month == 1 || month == 3 || month == 4 || month == 5 ||
                month == 6 || month == 7 || month == 8 || month == 9
            || month == 10 || month == 11 || month == 12 )
            return 31;

        if(month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if( month == 2) return isLeapYear(year) ? 29 : 28;
        return 0;

    }


    public static boolean isLeapYear( int year){
        return year % 400 == 0 || (year % 4  == 0 &&  year % 100 != 0);
    }
}
