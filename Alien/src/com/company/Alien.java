package com.company;

public class Alien {

     protected String eye;
     protected String name;
     protected int  leg;


     public Alien(String eyes, String names, int legs ){

         this.eye = eyes;
         this.name = names;
         this. leg = legs;
     }

     @Override
     public String toString(){
         return "eyes" + eye + " Name " + name + "legs" + leg;
     }

}
