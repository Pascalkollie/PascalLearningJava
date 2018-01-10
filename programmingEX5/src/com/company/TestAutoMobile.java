package com.company;


public class TestAutoMobile {


        public static void main (String[] args) throws java.lang.Exception

        {

            //create three automobile class objects

            Automobile obj1=new Automobile(-1,2018,201511,50,0,"NISSAN","GTR","BLACK");

            Automobile obj2=new Automobile(2,2012,201202,50,0,"ASTON MARTIN","DB2","WHITE");

            Automobile obj3=new Automobile(3,2013,201303,30,0,"Toyota","DB3","Grey");

            System.out.println("\n-------------AUTOMOBILE 1-------------");


            System.out.println("AUTOMOBILE NAME - "+obj1.getMake()+" "+obj1.getModel());

            System.out.println("AUTOMOBILE COLOUR - "+obj1.getColor());

            System.out.println("AUTOMOBILE ID - "+obj1.getID());

            System.out.println("AUTOMOBILE MAKE YEAR - "+obj1.getYear());

            System.out.println("AUTOMOBILE Vin Number - "+obj1.getVin_number());

            System.out.println("AUTOMOBILE Miles per Galon - "+obj1.getMiles_p_gallon());

            System.out.println("AUTOMOBILE Current Speed - "+obj1.getSpeed());



            obj1.Accelerate();

            System.out.println("AUTOMOBILE Accelerated Speed - "+obj1.getSpeed());

            obj1.Brake();

            System.out.println("AUTOMOBILE Speed after Brake - "+obj1.getSpeed());



//call the methods through the object and //print the values

            System.out.println("\n-------------AUTOMOBILE 2----- --------");

            System.out.println("AUTOMOBILE NAME - "+obj2.getMake()+" "+obj2.getModel());

            System.out.println("AUTOMOBILE COLOUR - "+obj2.getColor());

            System.out.println("AUTOMOBILE ID - "+obj2.getID());

            System.out.println("AUTOMOBILE MAKE YEAR - "+obj2.getYear());

            System.out.println("AUTOMOBILE Vin Number - "+obj2.getVin_number());

            System.out.println("AUTOMOBILE Miles per Galon - "+obj2.getMiles_p_gallon());

            System.out.println("AUTOMOBILE Current Speed - "+obj2.getSpeed());



            obj2.Accelarate(20); //overloaded function call System.out.println("AUTOMOBILE Accelerated   Speed - "+obj2.getSpeed());

            obj2.Brake(10); //overloaded function call

            System.out.println("AUTOMOBILE Speed after Brake - "+obj2.getSpeed());





//call the methods through the object and print //the values

            System.out.println("\n-------------AUTOMOBILE 3-------------");

            System.out.println("AUTOMOBILE NAME - "+obj3.getMake()+" "+obj3.getModel());

            System.out.println("AUTOMOBILE COLOUR - "+obj3.getColor());

            System.out.println("AUTOMOBILE ID - "+obj3.getID());

            System.out.println("AUTOMOBILE MAKE YEAR - "+obj3.getYear());

            System.out.println("AUTOMOBILE Vin Number - "+obj3.getVin_number());

            System.out.println("AUTOMOBILE Miles per Galon - "+obj3.getMiles_p_gallon());

            System.out.println("AUTOMOBILE Current Speed - "+obj3.getSpeed());

            obj3.Accelarate(30); //overloaded function call

            System.out.println("AUTOMOBILE Accelerated Speed - "+obj3.getSpeed());

            obj3.Brake(10); //overloaded function call

            System.out.println("AUTOMOBILE Speed after Brake - "+obj3.getSpeed());

        }

    }
