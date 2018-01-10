package com.company;

public class CarInsurancePolicy2 {

    private int policyNumber;
    private int numPayments;
    private String residentCity;

    public CarInsurancePolicy2(int num, int payments, String city)
    {
        policyNumber = num;
        numPayments = payments;
        residentCity = city;
    }

    public CarInsurancePolicy2(int num, int payments)
    {
        this(num, payments, "Mayfield");
    }

    public CarInsurancePolicy2(int num)
    {

        this(num, 2);
        policyNumber = num;
        residentCity = "Mayfield";
    }

    public void display()
    {
        System.out.println("Policy #" + policyNumber + ". " +
                numPayments + " payments annually. Driver resides in " +
                residentCity + ".");
    }


    public static void main(String []args)
    {
        CarInsurancePolicy2 first = new CarInsurancePolicy2(123);
        CarInsurancePolicy2 second = new CarInsurancePolicy2(456, 4);
        CarInsurancePolicy2 third = new CarInsurancePolicy2
                (789, 12, "Newcastle");
        CarInsurancePolicy2 fourth = new CarInsurancePolicy2(212, 2323, "Liberia");

        first.display();
        second.display();
        third.display();
        fourth.display();
    }
}



