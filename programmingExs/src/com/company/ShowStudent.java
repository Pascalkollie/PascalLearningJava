package com.company;

import java.util.Scanner;

public class ShowStudent {

    public static void main(String[] args) {


        Student newStudent = new Student();
        newStudent = values(newStudent);
        showValues(newStudent);

    }

    public static Student values(Student values) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student number ");
        values.setIdNumber(sc.nextDouble());
        System.out.println("Enter student credits hours ");
        values.setNumberOfCredit(sc.nextDouble());
        System.out.println(" Enter student grade points ");
        values.setNumberOfPoints(sc.nextDouble());
        values.setAvarageGrade();

        return values;
    }

    public static void showValues(Student sValues) {
        System.out.println("The student number is " + sValues.getIdNumber());
        System.out.println("The student credits hours is " + sValues.getNumberOfCredit());
        System.out.println("The student grad points " + sValues.getNumberOfPoints());
        System.out.println("The average G.P.A " + sValues.showAverageGrade());

    }

}

