package com.company;

public class OutgoingPhoneCall extends PhoneCall {

    int time;
    public OutgoingPhoneCall(String phonenumber , int time ) {
        super(phonenumber);
        setPrice();
        this.time =time;
    }

    public void setPrice() {
        price = 0.04;
    }

    void showInfo() {
        System.out.println("Phonenumber: " + getPhoneNumber() +
                " rate per min is $"+getPrice()+" number of minutes is "+ time +" total price is "+(time*price));
    }
}
