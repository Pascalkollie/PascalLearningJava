package com.company;

public class Student {

    private double idNumber;
    private double numberOfCredit;
    private double numberOfPoints;
    private double avarageGrade;

    public Student (){

           idNumber = 9999;
         this .numberOfCredit = 3;
         this. numberOfPoints = 12;
    }

     public void setIdNumber( double idN){
         idN = idNumber;
     }

     public void setNumberOfCredit (double noC){
         numberOfCredit = noC;
     }

     public void setNumberOfPoints (double nuP){
         nuP = numberOfPoints;
     }

     public void setAvarageGrade(){
         this.avarageGrade = this.numberOfPoints / this.numberOfCredit;
     }

     public double getIdNumber(){
         return idNumber;
     }

     public double getNumberOfCredit (){
         return numberOfCredit;
     }
     public  double getNumberOfPoints(){
         return  numberOfPoints;
     }

      public double showAverageGrade(){

         return this.avarageGrade;
      }
}
