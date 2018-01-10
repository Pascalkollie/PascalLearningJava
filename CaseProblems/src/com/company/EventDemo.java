package com.company;

public class EventDemo {

    public static void main(String[] args) {

        //Create event object
        Event e = new Event();
        e.setEventNum(CarlysEventPriceWithMethods.getEventNum());
        e.setNoOfGuest(CarlysEventPriceWithMethods.getNoOfGuests());

        //Display company motto
        CarlysEventPriceWithMethods.displayMotto(e);
    }
}


