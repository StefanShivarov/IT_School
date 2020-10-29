package com.company;
import java.util.Scanner;

public class methods_ex2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        print();

    }

    public static boolean isPrime(int n) {

        boolean result = false;

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {

                result = true;
                break;

            }
        }

        if (result) {

            return false;
        } else {

            return true;
        }
    }

    public static boolean isPalindromic(int n) {

        int remainder, reversedNum = 0;
        int originalNumber = n;
        while (n != 0) {

            remainder = n % 10;
            reversedNum = reversedNum * 10 + remainder;
            n /= 10;

        }

        if (originalNumber == reversedNum) {

            return true;
        } else {

            return false;
        }
    }

    public static void print() {

        int num = 2;
        int counter = 0;

        while (counter < 120) {
//System.out.print(num + " ");
            if (isPrime(num) && isPalindromic(num)) {
                counter++;
                System.out.print(num + " ");
                if (counter % 10 == 0) {

                    System.out.println();
                }

            }

            num++;

        }
    }

}