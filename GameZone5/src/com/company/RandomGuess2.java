package com.company;

import javax.swing.*;

public class RandomGuess2 {

    public  static void main(String [] args){

    int tries = 0;

    int guess;

    int toGuess;

    int low, high;

          JOptionPane

                  .showMessageDialog(null,

                  "\nWelcome to Guess My Number\n Pascal vs Player Edition\n\n");

    guess = (int) (Math.random() * 10);
    // do while loop
          do
            {

        toGuess = Integer
                .parseInt(JOptionPane
                        .showInputDialog("Please enter your number (between 1 & 10): "));

        // check whether the user enters yes or no

        if (toGuess < guess)

        {
            JOptionPane.showMessageDialog(null, "lower");
            tries++;
        }

        else if (toGuess > guess)

        {
            JOptionPane.showMessageDialog(null, "high");

            tries++;
        }

    } while (toGuess != guess && tries < 7);

    // check the user is able to guess with in the given tries

    // if guessed print the congratulation message

          if (toGuess == guess)
    {

        JOptionPane.showMessageDialog(null, "You gussed it. Congrats!");
    }
    // condition if print the actual secrete number

          else
    {
        JOptionPane.showMessageDialog(null,
                "The actual guessed number is: " + toGuess);
    }
}

}
