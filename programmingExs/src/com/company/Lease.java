package com.company;

import java.util.Date;

public class Lease {

    private String name;
    private double apartmentNumber;
    private double rent;
    private double term;


    public Lease()
    {
        name = "xxx";
        apartmentNumber = 0;
        rent = 1000;
        term = 12;
    }
    public void setname(String nm) { name = nm; }
    public void setapartmentNumber(double aptnbr)
    {
        apartmentNumber = aptnbr;
    }
    public void setrent(double rnt)
    {
        rent = rnt;
    }
    public void setterm(double tm)
    {
        term = tm;
    }
    public String getname()
    {
        return name;
    }
    public double getapartmentNumber()
    {
        return apartmentNumber;
    }
    public double getrent()
    {
        return rent;
    }
    public double getterm()
    {
        return term;
    }
    public void addPetFee()
    {
        rent += 10;
        explainPetPolicy();
    }
    public static void explainPetPolicy()
    {
        System.out.println("10 $ is add to all pet owner rant  ");

    }

}

