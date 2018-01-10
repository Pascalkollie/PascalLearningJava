package com.company;
import java.util.*;

public class CarlysEventPriceWithMethods {

    //Scanner
    private static Scanner sc = new Scanner(System.in);

    /**
     * Prompts the user for the event number and returns the value
     *
     * @return
     */
    public static String getEventNum() {
        System.out.println("Enter event number: ");
        return sc.next();
    }

    /**
     * Prompts the user for the number of guests and returns the value
     *
     * @return
     */
    public static int getNoOfGuests() {
        System.out.println("Enter no of guests: ");
        return sc.nextInt();
    }

    /**
     * Displays the company motto with the border
     *
     * @return
     */
    public static void displayMotto(Event e) {
        System.out.println(String.format("%26s", " ").replace(" ", "*"));
        System.out.printf("* %22s *", " ");
        System.out.println("\n*    Carly’s Catering    *");
        System.out.printf("* %22s *\n", " ");
        System.out.println(String.format("%26s", " ").replace(" ", "*"));
        System.out.println("Event No: " + e.getEventNum());
        System.out.println("No. of guests:" + e.getNoOfGuest());
        System.out.println("Price per guest: $" + Event.PRICE_PER_GUEST);
        computePrice(e);
    }

    /**
     * Computes the price of the event
     * Displays the price, and displays whether the event is a large event
     *
     * @return
     */
    public static void computePrice(Event e) {
        System.out.println("Price: $" + e.getPrice());
        System.out.println("Large event: " + ((e.getNoOfGuest() > Event.CUT_OFF) ? "Yes" : "No"));
    }

    public static void main(String[] args) {

        //Close scanner
        sc.close();
    }
}
