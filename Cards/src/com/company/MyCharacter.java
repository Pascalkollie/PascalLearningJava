package com.company;

public class MyCharacter {

     private String name;
     private String eyes;
     private String nose;
     private int legs;

     public MyCharacter (){

         this.name ="";
         this.eyes ="";
         this.nose ="";
         this.legs = 0;

     }

     public void setName(String name1){
         name1 = name;
     }

    public void setNose(String nose1){
        nose1 = nose;
    }

    public void setEyes(String eyes1){
        eyes1 = eyes;
    }

    public void setLegs(int legs1){
         legs1 = legs;
    }

    public String getName(){
        return name;
    }

    public String getEyes (){
        return eyes;
    }

    public String getNose (){
        return nose;
    }

    public int getLegs (){
        return legs;
    }
}
