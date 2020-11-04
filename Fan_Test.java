package com.company;

import java.util.Scanner;

public class Fan_Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.switchOn();

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.switchOff();


        System.out.println("Fan 1:\n"+fan1);
        System.out.println("Fan 2:\n"+fan2);
    }
}
