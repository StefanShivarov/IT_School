package com.company;
import java.util.Scanner;
public class Project07_ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of lines: ");
        int n = Integer.parseInt(scanner.nextLine());
        int currentLength = n;
        for(int i = 0; i < n; i++){

            for(int j = 0; j < n-(n-i); j++){

                System.out.print(" ");
            }

            for(int k = 0; k < currentLength; k++){

                System.out.print("*");
            }

            currentLength--;
            System.out.println();
        }
    }
}
