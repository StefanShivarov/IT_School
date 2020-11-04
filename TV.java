package com.company;

public class TV {

    private int channel;
    private int volumeLevel;
    private boolean on;

    public TV(){
    }
    public void turnOn(){
        this.on = true;
        System.out.println("TV is turned on.");
    }
    public void turnOff(){
        this.on = false;
        System.out.println("TV is turned off.");
    }
    public void setChannel(int newChannel){
        this.channel = newChannel;
    }
    public void setVolume(int newVolumeLevel){
        this.volumeLevel = newVolumeLevel;
    }
    public void channelUp(){
        this.channel++;
    }
    public void channelDown(){
        this.channel--;
    }
    public void volumeUp(){
        this.volumeLevel++;
    }
    public void volumeDown(){
        this.volumeLevel--;
    }
    public int getVolume(){
        return this.volumeLevel;
    }
    public int getChannel(){
        return this.channel;
    }


}
