package com.company;

public class ChainedExceptionDemo {

     public static void main (String [] args){

      try {
          method1();
      }
      catch (Exception ex){
          ex.printStackTrace();
         }
     }

     public static void method1() throws Exception {
         try{
             method1();
         }
         catch (Exception ex){
             throw new Exception("New info from Method1", ex);

         }
     }
}
