package com.company;
import java.util.Scanner;
public class Project07_ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int currentLength = n;
        for(int i = 0; i < n; i++){

            for(int j = currentLength; j > 0; j--){

                System.out.print(j+" ");
            }

            if(i!=n-1) {
                for (int k = 2; k <= currentLength; k++) {

                    System.out.print(k + " ");
                }
            }
            currentLength--;
            System.out.println();
        }
    }
}
