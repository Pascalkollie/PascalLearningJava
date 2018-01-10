package com.company;

public class Die {

        static final int HIGHEST_DIE_VALUE=6;
        static final int LOWEST_DIE_VALUE=1;
        private int randomValue;
          public Die() {
            randomValue= ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
        }
      public int getValue()
    { return randomValue;

    }
}



