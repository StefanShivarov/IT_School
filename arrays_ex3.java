package com.company;
import java.util.Random;
import java.util.Scanner;
public class arrays_ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[]numArray = new int[10];

        for(int i = 0; i < numArray.length; i++){

            System.out.println("Element "+(i+1)+":");
            int num = Integer.parseInt(scanner.nextLine());
            numArray[i]=num;
        }

        int temp = numArray[0];

        for(int i = 0; i < numArray.length-1; i++){

            numArray[i] = numArray[i+1];
        }

        numArray[numArray.length-1] = temp;

        for(int output:numArray){

            System.out.print(output+" ");
        }
    }
}
