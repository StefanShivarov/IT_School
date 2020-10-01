package com.company;
import java.util.Scanner;

public class ColorRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a color code");
        double code = Double.parseDouble(scanner.nextLine());
        String color = "";

        if (code >= 380 && code < 450) {

            color = "Violet";
        } else if (code >= 450 && code < 495) {

            color = "Blue";
        } else if (code >= 495 && code < 570) {

            color = "Green";
        } else if (code >= 570 && code < 590) {

            color = "Yellow";
        } else if (code >= 590 && code < 620) {

            color = "Orange";
        } else if (code >= 620 && code < 750) {

            color = "Red";
        }

        if (code < 380 || code >= 750) {

            System.out.println("The entered wavelength is not a part of the visible spectrum");
        } else {

            System.out.println("The color is " + color);
        }

    }
}

