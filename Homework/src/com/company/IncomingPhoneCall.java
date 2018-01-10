package com.company;

public class IncomingPhoneCall extends PhoneCall {


    public IncomingPhoneCall(String phonenumber) {
        super(phonenumber);
        setPrice();
    }

    public void setPrice() {
        price = 0.02;
    }

    void showInfo() {
        System.out.println("Phonenumber: " + getPhoneNumber() + " $"+getPrice());
    }
}

