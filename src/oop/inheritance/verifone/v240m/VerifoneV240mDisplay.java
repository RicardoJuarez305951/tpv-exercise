package oop.inheritance.verifone.v240m;

import oop.inheritance.core.TPVDisplay;

public class VerifoneV240mDisplay implements TPVDisplay {

    private static VerifoneV240mDisplay uniqueInstance;

    private boolean lightTurnedOn;

    private VerifoneV240mDisplay(){

    }

    public static VerifoneV240mDisplay getInstance(){

        if(uniqueInstance == null){
            uniqueInstance = new VerifoneV240mDisplay();
        }

        return uniqueInstance;
    }

    /**
     * Prints a message to specied position
     *
     * @param x       horizontal position
     * @param y       vertical position
     * @param message message to be printed
     */
    @Override
    public void showMessage(int x, int y, String message){
    }
    @Override
    public void toggleLight() {
        lightTurnedOn = !lightTurnedOn;
    }


    /**
     * Clears the screen
     */
    public void clear(){

    }
}
