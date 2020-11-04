package com.company;
import java.util.Scanner;

public class TV_Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TV tv = new TV();

        tv.turnOn();//TV is turned on.

        tv.setChannel(17);
        for (int i = 0; i < 3; i++) {
            tv.channelUp();
        }
        for(int i = 0; i < 4; i++){
            tv.channelDown();
        }
        System.out.printf("Current channel: %d%n",tv.getChannel());//Current channel: 16

        tv.setVolume(45);
        for(int i = 0; i < 10; i++){
            tv.volumeUp();
        }
        for(int i = 0; i < 8; i++){
            tv.volumeDown();
        }
        System.out.printf("Current volume level: %d%n",tv.getVolume());//Current volume level: 47

        tv.turnOff();//TV is turned off.

    }
}
