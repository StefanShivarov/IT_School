package com.company;

import java.util.Scanner;

public class RegularPolygon_Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.printf("Polygon 1 -> Area: %.2f ; Perimeter: %.2f%n",polygon1.getArea(), polygon1.getPerimeter());
        System.out.printf("Polygon 2 -> Area: %.2f ; Perimeter: %.2f%n",polygon2.getArea(), polygon2.getPerimeter());
        System.out.printf("Polygon 3 -> Area: %.2f ; Perimeter: %.2f",polygon3.getArea(), polygon3.getPerimeter());

    }
}
