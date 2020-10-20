package com.company;

import java.util.Scanner;

public class arrays_ex6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Rows:");
        int rows = Integer.parseInt(scanner.nextLine());
        System.out.println("Columns:");
        int columns = Integer.parseInt(scanner.nextLine());
        int[][]inputMatrix = new int[rows][columns];
        int[][]transposedMatrix = new int[columns][rows];

        for(int r = 0; r < rows; r++){

            for(int c = 0; c < columns; c++){

                inputMatrix[r][c] = scanner.nextInt();
            }
        }

        for(int c = 0; c < columns; c++){

            for(int r = 0; r < rows; r++){

                transposedMatrix[r][c] = inputMatrix[r][c];

                System.out.print(transposedMatrix[r][c]+" ");
            }
            System.out.println();
        }

    }
}
