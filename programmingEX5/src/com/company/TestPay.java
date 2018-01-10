package com.company;

import javax.swing.*;
import java.util.Scanner;

public class TestPay {

    public static void  main(String[] args)

    {int in;
        int skillLevel;
        int hoursWorked;
        int insuranceOption1;
        int insuranceOption2;
        int insuranceOption3;
        int retirementPlan;
        skillLevel = 0;
        hoursWorked = 0;
        insuranceOption1 = 0;
        insuranceOption2 = 0;
        insuranceOption3 = 0;
        retirementPlan = 0;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.print("Enter skill level of an employee (1/2/3):");
            skillLevel = input.nextInt();
            if(skillLevel<1||skillLevel>3)
                System.out.println("must be 1, 2 or 3");
        }while(skillLevel<1||skillLevel>3);
        System.out.print("Enter hours worked: ");
        hoursWorked=input.nextInt();
        if(skillLevel == 2 || skillLevel == 3)
        {
            in= JOptionPane.showConfirmDialog(null,
                    "Do you want medical insurance?",null, JOptionPane.YES_NO_OPTION);
            if(in==JOptionPane.YES_OPTION)
                insuranceOption1=1;
            in= JOptionPane.showConfirmDialog(null,
                    "Do you want Dental insurance?",null, JOptionPane.YES_NO_OPTION);
            if(in==JOptionPane.YES_OPTION)
                insuranceOption2=1;
            in= JOptionPane.showConfirmDialog(null,
                    "Do you want Disability?",null, JOptionPane.YES_NO_OPTION);
            if(in== JOptionPane.YES_OPTION)
                insuranceOption3=1;

        }
        if(skillLevel == 3)
        {
            System.out.print("Enter 1 for retirement plan or enter 0: ");
            retirementPlan = input.nextInt();
        }
        Pay pay = new Pay(skillLevel, hoursWorked, insuranceOption1, insuranceOption2, insuranceOption3, retirementPlan);
        pay.displayEmployeeDetails();

    }
}

