package com.company;

public class Jupiterian extends Alien {

     public Jupiterian(String eye, String name,  int legs ){
         super(eye, name, legs);
     }

     public String toString(){

         return "\nAlien\nEyes=" + eye + "\nName=" + name
                 + "\nLegs=" + leg;
     }
}
