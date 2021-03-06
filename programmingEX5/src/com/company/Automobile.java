package com.company;

import java.util.Scanner;

public class Automobile {

        //Declare variables

        int ID, year, vin_number, miles_p_gallon, speed;

        String make, model, color;

        Scanner scan = new Scanner(System.in);

        //default constructor

        Automobile()

        {

            ID = 0;

            year = 0;

            vin_number = 0;

            miles_p_gallon = 0;

            speed = 0;

            make = "NO MAKE";

            model = "NO MAKE";

            color = "NO MAKE";

        }

        //parameterized constructor

        Automobile(int id, int y, int vin_num, int m_p_g, int s, String mak, String mod, String col) {

        ID = setID(id);

        year = setYear(y);

        vin_number = vin_num;

        miles_p_gallon = setMiles_p_gallon(m_p_g);

        speed = s;

        make = mak;

        model = mod;

        color = col;

    }

        //mutator methods

        //detUd method

    int setID(int id)

    {

        if (id > 9999 || id < 0)

            id = 0;

        return id;

    }

    //setYear method

    int setYear(int y) {

        if (y < 2000 || y > 2017)

            y = 0;

        return y;

    }

    //setMiles_p_gallon method

    int setMiles_p_gallon(int m_p_g)

    {

        if (m_p_g < 10 || m_p_g > 60)

            m_p_g = 0;

        return m_p_g;

    }

    //accessor methods

    //getId() method

    int getID()

    {

        return ID;

    }

    //getYear method

    int getYear() {

        return year;

    }

    //getVin_number method

    int getVin_number()

    {

        return vin_number;

    }

    //getMiles_p_gallon method

    int getMiles_p_gallon()

    {

        return miles_p_gallon;

    }

    //getSpeed method

    int getSpeed()

    {

        return speed;

    }

    //getMake method

    String getMake()

    {

        return make;

    }

    String getModel()

    {

        return model;

    }

    String getColor()

    {

        return color;

    }

    void Accelerate()

    {

        speed += 5;

    }

    void Brake()

    {

        speed -= 5;

    }



    //overriding method Brake method

    void Brake(int deSpeed)

    {

        speed -= deSpeed;

    }



    //overriding method Accelarate method

    public void Accelarate(int incSpeed)

    {

        speed += incSpeed;

    }

}
