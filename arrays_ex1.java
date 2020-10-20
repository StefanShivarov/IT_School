package com.company;
import java.util.Scanner;
import java.util.Random;

    public class arrays_ex1{

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            Random rand = new Random();
            int[]numberArray = new int[20];

            for(int i = 0; i < numberArray.length; i++){

                int randomNum = rand.nextInt(100);
                numberArray[i] = randomNum;

            }

            for(int output:numberArray){

                System.out.print(output+" ");
            }


        }
    }
