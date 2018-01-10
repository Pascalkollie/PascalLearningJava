package com.company;

public class SpaceShip extends Shap implements Dockable {


    // Data Members


    public enum ShipType {
        FRIGAT, BATTLESHIP, MINERLAYER, ESCORT, DEFFAMCE
    }

     ShipType shipType = ShipType.BATTLESHIP;

    public SpaceShip(){
        System.out.println("\nSpaceShip created with default ship type ");

    }


    public SpaceShip(ShipType shipType) {
        System.out.println("\nSpaceShip created with specified ship type ");

        this.shipType = shipType;

        // Methods to override from Dockable interface
    }

        @Override
                public void  dockShip(){
            System.out.println("This is the override method for the dockable interface ");

        }

    }

}
