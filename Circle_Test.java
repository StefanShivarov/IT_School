package com.company;

import java.util.Scanner;

public class Circle_Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Circle1Info
        System.out.println("Circle 1 radius = ?");
        double radius = Double.parseDouble(scanner.nextLine());
        Circle circle1 = new Circle(radius);

        //Circle2Info
        System.out.println("Circle 2 radius = ?");
        Circle circle2 = new Circle();
        circle2.setRadius(Double.parseDouble(scanner.nextLine()));

        //Circle3Info
        System.out.println("Circle 2 radius = ?");
        Circle circle3 = new Circle();
        double radius3 = Double.parseDouble(scanner.nextLine());
        circle3.setRadius(radius3);

        //Output
        System.out.printf("Circle 1 -> Area: %.2f ; Perimeter: %.2f%n",circle1.getArea(), circle1.getPerimeter());
        System.out.printf("Circle 2 -> Area: %.2f ; Perimeter: %.2f%n",circle2.getArea(), circle2.getPerimeter());
        System.out.printf("Circle 3 -> Area: %.2f ; Perimeter: %.2f",circle3.getArea(), circle3.getPerimeter());

    }
}
