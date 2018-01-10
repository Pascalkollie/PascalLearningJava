package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {


     public static void main (String [] args){


         List<String> name = new ArrayList<>();

       int[] number = {2,1 ,3,4,5,6,7};
         for (int i = 0; i < number.length ; i++) {
             System.out.println(bubbleSort(number) [i]);


         }

       String[] color = {"Green", "Blue", "Purple", "Red", "Orange"};
         Arrays.sort(color);
         for (String c: color)
         {
             System.out.println(c);
         }

     }

      public  static int [] bubbleSort( int[] list){

         int temp = 0;

          for (int i = 0; i < list.length  -1 ; i++) {

              for (int j = 0; j <list.length - 1 -i ; j++) {
                  if(list[j] > list[j + 1]){

                      temp = list[j];
                      list[j] = list[j + 1];
                      list[j + 1] = temp;
                  }
              }
          }
            return list;
      }
}
