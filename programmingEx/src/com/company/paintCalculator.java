package com.company;

import java.util.Scanner;

public class paintCalculator {

        public static void main(String [] args)
        {
            Scanner keyboard = new Scanner(System.in);


            double height;
            double length;
            double width;
            double price = 0 ;




            System.out.print("Please enter the height of the room: ");
            height = keyboard.nextDouble();

            System.out.print("Please enter the length of the room: ");
            length = keyboard.nextDouble();

            System.out.print("Please enter the width of the room: ");
            width = keyboard.nextDouble();

            double area =WallAreaMethod(height, length, width);
            System.out.println(" area "+area);

            double value =paintFormula(area, price, height, length, width);
              System.out.println("area\n"+area);


        }

        public static double WallAreaMethod(double height, double length, double width)
        {
            double wallArea;
            wallArea = length * height * width * height;

            return wallArea;
        }


        public static double paintFormula(double wallAreaMethod, double price, double height, double length,double width)
        {


            double paintQuantity;

            paintQuantity = wallAreaMethod * 2 / 350;


                   System.out.println("For a room of height " + height + "feet, length " +
                    length + " feet, and width " + width + " feet you need to purchase "
                    + paintQuantity + " gallons of paint.");

                    price = paintQuantity * 32.0;
                    System.out.println("The price will be $" + price + ".");


            return price;
        }

    }
