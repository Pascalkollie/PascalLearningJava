package com.company;

public class DogTriathlonParticipant {

     public static void main (String[]args) {


         private boolean scoresAgree;

         if (NUM_EVENTS == 0)
             avg = 0;
         else
             avg = (double) total / NUM_EVENTS;

         int totalNot0 = 0;
         if(score1 != 0)
             totalNot0 = totalNot0 + 1;
         if(score2 != 0)
             totalNot0 = totalNot0 + 1;
         if(score3 != 0)
             totalNot0 = totalNot0 + 1;

         if(numEvents == totalNot0)
             scoresAgree = true;
         else
             scoresAgree = false;

         if(!scoresAgree)
             System.out.println("\nNotice! Number of events for " +
                     name + " does not agree with scores reported.");

     }

}
