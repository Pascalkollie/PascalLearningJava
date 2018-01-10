package com.company;

public class PhoneCallArray {

     public static void main (String [] args){
         PhoneCall somecall[] = new PhoneCall[10];

         int x;

         somecall[0] = new IncomingPhoneCall("123-895-7542");

         somecall[1] = new OutgoingPhoneCall("254-986-5324",25);

         somecall[2] = new IncomingPhoneCall("157-789-5421");

         somecall[3] = new OutgoingPhoneCall("154-853-1235",90);

         somecall[4] = new IncomingPhoneCall("125-894-6584");

         somecall[5] = new OutgoingPhoneCall("234-859-6548",250);

         somecall[6] = new IncomingPhoneCall("236-986-5214");

         somecall[7] = new IncomingPhoneCall("546-235-6987");

         somecall[8] = new IncomingPhoneCall("231-856-9854");

         somecall[9] = new IncomingPhoneCall("946-589-7985");

         for(x = 0; x < somecall.length; ++x)

             System.out.println("Call: " + somecall[x].getPhoneNumber() + " costs $" + somecall[x].getPrice());

     }

}
