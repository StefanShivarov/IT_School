package com.company;

import java.util.Scanner;

public class arrays_ex7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert answers key:");
        String[]answersKey = scanner.nextLine().split("\\s+");
        String output = "";
        String[][]answersMatrix = new String[8][10];

        for(int student = 0; student < 8; student++){

            System.out.println("Student "+student+" answers:");

            answersMatrix[student] = scanner.nextLine().split("\\s+");
        }

        for(int r = 0; r < 8; r++){

            int correctAnswersCounter = 0;

            for(int c = 0; c < 10; c++){

                if(answersMatrix[r][c].equals(answersKey[c])){

                    correctAnswersCounter++;
                }
            }

            output += String.format("Student %d result: %d/10%n",r, correctAnswersCounter);

        }

        System.out.println(output);

    }
}
