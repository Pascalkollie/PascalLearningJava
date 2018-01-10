package com.company;

public class SandWich {

     private String ingredient;
     private String breadType;
     private double price;

      public SandWich(){

          ingredient ="Tuna";
           breadType ="Wheat";
           price = 4.99;


    }

       public void setIngredient(String ig){
            ingredient = ig;
       }

       public void setBreadType(String bt){
           breadType = bt;
       }

       public void setPrice (double p){
            price = p;
       }

       public String getIngredient(){
           return ingredient;
       }

       public String getBreadType(){
           return breadType;
       }

       public double getPrice(){
           return price;
       }
}

