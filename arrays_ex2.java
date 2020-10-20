package com.company;

import java.util.Random;
import java.util.Scanner;

public class arrays_ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[]numArray = new int[10];
        Random rand = new Random();

        for(int i = 0; i < numArray.length; i++){

            System.out.println("Element "+(i+1)+":");
            int num = Integer.parseInt(scanner.nextLine());
            numArray[i]=num;
        }

        for(int i = 0; i < numArray.length; i++){

            int randomIndex = rand.nextInt(numArray.length-1);
            int valueKeeper = numArray[randomIndex];

            numArray[randomIndex] = numArray[i];
            numArray[i] = valueKeeper;

        }

        for(int output:numArray){

            System.out.print(output+" ");
        }
    }
}
