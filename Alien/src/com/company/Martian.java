package com.company;

public class Martian extends Alien {


    public Martian(String eyes, String names, int legs) {
        super(eyes, names, legs);
    }


    public String toString(){

        return "\nAlien\nEyes=" + eye + "\nName=" + name
                + "\nLegs=" + leg;
    }
}
