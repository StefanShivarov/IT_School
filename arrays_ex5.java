package com.company;
import java.util.Scanner;

public class arrays_ex5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][]matrix = new int[5][5];

        for(int r = 0; r < 5; r++){

            for(int c = 0; c < 5; c++){

                matrix[r][c] = scanner.nextInt();
            }

        }

        int maxSum = Integer.MIN_VALUE;
        int rowSum;
        int maxRow = 0;
        for(int r = 0; r < 5; r++){

            rowSum = 0;

            for(int c = 0; c < 5; c++){

                rowSum+= matrix[r][c];
            }

            if(rowSum>maxSum){

                maxSum = rowSum;
                maxRow = r;
            }


        }

        System.out.println("Max sum at row "+(maxRow+1));
    }
}
