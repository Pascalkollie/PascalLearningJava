package com.company;

public class PhoneCallDemo {

    public static void main(String[] args) {
        IncomingPhoneCall phone1 = new IncomingPhoneCall("404-345-2673");
        OutgoingPhoneCall call = new OutgoingPhoneCall("678-698-3162", 90);
        phone1.showInfo();
        call.showInfo();

    }
}
