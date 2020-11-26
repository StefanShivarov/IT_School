package zad18;

import java.util.Scanner;

public class Test18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Side 1 = ?");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Side 2 = ?");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Side 3 = ?");
        double side3 = Double.parseDouble(scanner.nextLine());

        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(triangle.printRectangle());
    }
}
