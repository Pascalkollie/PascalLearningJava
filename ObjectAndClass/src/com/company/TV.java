package com.company;

public class TV {
    /**
     * data fields
     */
    int channel = 1; // Default channel is 1
    int volumeLevel = 1; // Default volume level is 1
    boolean on = false; // TV is off

    /**
     * Constructor
     */

    public TV() {
    }

    /**
     * Method
     */

    public void turnOn() {
        on = true; // Turn on TV
    }

    public void turnOff() {
        on = false;  // Turn off tv
    }

    public void setChannel(int newChanne1) {  // Set a new Channel
        if (on && newChanne1 >= 1 && newChanne1 <= 120)
            channel = newChanne1;
    }

    public void setVolumeLevel(int newVolumeLevel) { // Set a new volume volume level
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
    }

    public void channelUp() {
        if (on && channel < 120) // increase channel
            channel++;
    }

    public void channelDown() {
        if (on && channel > 1)
            channel--;
    }

    public void volumeUp() {
        if (on && volumeLevel < 7)
            volumeLevel++;
    }

    public void volumeDown() {
        if (on && volumeLevel > 1) {
            volumeLevel--;
        }

    }

}
