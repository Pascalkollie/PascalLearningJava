package com.company;

import java.util.Scanner;

public class TwoCharacter {

      public static void main(String [] args){

           MyCharacter character1 = new MyCharacter();
            character1 = createCharacter( character1);
            showCharacter(character1);

            MyCharacter character2 = new MyCharacter();
            character2 = createCharacter(character2);
            showCharacter(character2);
      }

       public static MyCharacter createCharacter (MyCharacter characters){
           Scanner sc = new Scanner(System.in);

           System.out.println("Enter character name");
           characters.setName(sc.nextLine());

           System.out.println("Enter character eyes color");
           characters.setEyes(sc.nextLine());

           System.out.println("Enter character nose type");
           characters.setEyes(sc.nextLine());

           System.out.println("Enter character number of legs ");
           characters.setLegs(sc.nextInt());

           return  characters;
       }

       public static void showCharacter(MyCharacter character){

           System.out.println("The character Name is " + character.getName());
           System.out.println("The character eyes color is " + character.getEyes());
           System.out.println("The character nose is " + character.getNose());
           System.out.println("Character has  " + character.getLegs() + " legs");


       }
}
