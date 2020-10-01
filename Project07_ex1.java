package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Project07_ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("First string:");
        String first = scanner.nextLine();
        System.out.println("Second string:");
        String second = scanner.nextLine();

        first = first.replaceAll("\\s+","");
        second = second.replaceAll("\\s+","");
        first = first.replaceAll(",","");
        second = second.replaceAll(",","");
        first = first.replaceAll("\\.","");
        second = second.replaceAll("\\.","");

        boolean areAnagrams = true;


        if(first.length()!=second.length()){

            areAnagrams = false;
        }else{

            char[]firstArr = first.toLowerCase().toCharArray();
            char[]secondArr = second.toLowerCase().toCharArray();

            Arrays.sort(firstArr);
            Arrays.sort(secondArr);

            areAnagrams = Arrays.equals(firstArr, secondArr);
        }

        if(areAnagrams){

            System.out.println("yes");
        }else{

            System.out.println("no");
        }

    }
}
