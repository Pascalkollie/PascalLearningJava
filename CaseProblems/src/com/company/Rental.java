package com.company;

public class Rental {

    //constant fields
    public final static int num_min = 60;//fields that hold the number of minutes in an hour
    public final static int rate_hour = 40;//fields that hold the hourly rental rate
    //other fields
    private String contract_number;
    private int number_of_hours,
            number_of_minutes,
            price;

    //default constructor
    public Rental() {
        this.setContract_number("A000");
        this.setHoursAndMinutes(0);
    }

    //parameterised constructor
    public Rental(String contract_number, int number_of_minutes) {
        this.setContract_number(contract_number);
        this.setHoursAndMinutes(number_of_minutes);
    }

    //getter/setters
    public String getContract_number() {
        return contract_number;
    }

    public int getNumber_of_hours() {
        return number_of_hours;
    }

    public int getNumber_of_minutes() {
        return number_of_minutes;
    }
    public void setPrice(){
        price = getPrice() * rate_hour;
    }
    public int getPrice() {
        return price;
    }

    private void setContract_number(String contract_number) {
        this.contract_number = contract_number;
    }

    private void setHoursAndMinutes(int number_of_minutes) {
        this.number_of_hours = number_of_minutes / num_min;
        this.number_of_minutes = number_of_minutes % num_min;
        this.price = rate_hour * number_of_hours;

    }

    //method to print the output
    @Override
    public String toString() {
        return "Rental{" + "contract_number=" + contract_number + ", number_of_hours=" + number_of_hours + ", number_of_minutes=" + number_of_minutes + ", price=" + price + '}';
    }

}